import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RemitlyTask {

    public static boolean isValidMethod(String jsonString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonString);
        return jsonNode.get("PolicyDocument").get("Statement").get(0).get("Resource").asText().equals("*");
    }
}
