public class NameFomatter {

    public static String format( String prefix,
                                 String firstName,
                                 String middleName,
                                 String lastName,
                                 String suffix) {

        //Input (parameters) validation
        if(prefix == null){
            prefix = "";
        }
        if(firstName == null){
            firstName = "";
        }
        if(middleName == null){
            middleName = "";
        }
        if(lastName == null){
            lastName = "";
        }
        if(suffix == null){
            suffix = "";
        }

        //Check required parameters

        if(lastName.isEmpty()){
            throw new IllegalArgumentException("You must provide a last name");
        }

        if(firstName.isEmpty()){
            throw new IllegalArgumentException("You must provide a first name");
        }

        // now build up results
        String result = "";
        result += lastName + ", ";

        if(!prefix.isEmpty()){
            result += prefix + " ";
        }

        result += firstName + " ";

        if(!middleName.isEmpty()){
            result += middleName; //no space added because we do not know if they have a suffix yet.
        }

        if(!suffix.isEmpty()){
            result +=  ", " + suffix; // if they have a diffix, there is a space at the front.
        }

        return  result;

    }
}