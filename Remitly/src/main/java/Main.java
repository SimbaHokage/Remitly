import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        String json = "{" +
                "\"PolicyName\": \"root\"," +
                "    \"PolicyDocument\": {" +
                "        \"Version\": \"2012-10-17\"," +
                "        \"Statement\": [" +
                "            {" +
                "                \"Sid\": \"IamListAccess\"," +
                "                \"Effect\": \"Allow\"," +
                "                \"Action\": [" +
                "                    \"iam:ListRoles\"," +
                "                    \"iam:ListUsers\"" +
                "                ]," +
                "                \"Resource\": \"*\"" +
                "            }" +
                "        ]" +
                "    }" +
                "}";
        System.out.println(RemitlyTask.isValidMethod(json));
    }
}
