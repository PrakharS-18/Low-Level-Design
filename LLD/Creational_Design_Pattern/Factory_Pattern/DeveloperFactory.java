package LLD.Creational_Design_Pattern.Factory_Pattern;

public class DeveloperFactory {

    public static Developer getDeveloperWithLanguage(String languageType) {
        if ( languageType.trim().equalsIgnoreCase("JAVA")) {
            return new JavaDeveloper();
        }
        else if(languageType.trim().equalsIgnoreCase("CPP")) {
            return new CppDeveloper();
        } else if (languageType.trim().equalsIgnoreCase("PYTHON")) {
            return new PythonDeveloper();
        }
        else {
            return null;
        }
    }
}
