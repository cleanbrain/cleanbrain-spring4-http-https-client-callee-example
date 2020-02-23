package kr.co.cleanbrain.ctrl;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: 노상현
 * Date: 2020-02-17
 * Time: 오후 12:50
 */
@Controller
public class MainController {

    @ResponseBody
    @RequestMapping(value = "/getJsonData", method = {RequestMethod.POST})
    public Map<String, Object> getTestData(HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("testStringKey", "testStringValue");

        List<String> list = new ArrayList<>();
        list.add("testListVluae1");
        list.add("testListVluae2");
        list.add("testListVluae3");
        list.add("testListVluae4");
        list.add("testListVluae5");
        jsonObject.put("testListKey", list);

        Set<String> set = new HashSet<>();
        set.add("testSetValue1");
        set.add("testSetValue2");
        set.add("testSetValue3");
        set.add("testSetValue4");
        set.add("testSetValue5");
        jsonObject.put("testSetKey", set);

        Map<String, Object> map = new HashMap<>();
        map.put("innerMapKey1", "innerMapValue1");
        map.put("innerMapKey2", "innerMapValue2");
        map.put("innerMapKey3", "innerMapValue3");
        map.put("innerMapKey4", "innerMapValue4");
        map.put("innerMapKey5", "innerMapValue5");
        jsonObject.put("testMapKey", map);

        return jsonObject;
    }

}
