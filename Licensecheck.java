import java.io.IOException;

public class LicenseManager {
    private int validationLicenses;
    private int translationLicenses;

    public LicenseManager(int validationLicenses, int translationLicenses)
    
     {
        this.validationLicenses = validationLicenses;
        this.translationLicenses = translationLicenses;
    }

    public synchronized boolean checkAndAcquireLicense(String licenseType) {
        if (licenseType.equals("Validation")) {
            if (validationLicenses > 0) {
                validationLicenses--;
                return true;
            }
        } else if (licenseType.equals("Translation")) {
            if (translationLicenses > 0) {
                translationLicenses--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LicenseManager licenseManager = new LicenseManager(1, 2);

        while (true) {
            boolean validationAvailable = licenseManager.checkAndAcquireLicense("Validation");
            boolean translationAvailable = licenseManager.checkAndAcquireLicense("Translation");

            if (validationAvailable && translationAvailable) {
                break;
            } else {
                System.out.println("Waiting for licenses to become available...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        if (licenseManager.checkAndAcquireLicense("Validation")) {
            try {
                Process validationProcess = new ProcessBuilder("Validation.exe").start();
                validationProcess.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (licenseManager.checkAndAcquireLicense("Translation")) {
            try {
                Process translationProcess = new ProcessBuilder("Translation.exe").start();
                translationProcess.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
