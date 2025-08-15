package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ud8  reason: default package */
public final class ud8 {
    public static JSONObject a(Set set, bg1 bg1, zad zad) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) bg1 != null ? bg1.c() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int i = td8.$EnumSwitchMapping$0[((qd8) it.next()).ordinal()];
            if (i == 1) {
                str = "AUDIO";
            } else if (i == 2) {
                str = "VIDEO";
            } else if (i == 3) {
                str = "SCREEN_SHARING";
            } else if (i == 4) {
                str = "MOVIE_SHARING";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            jSONArray.put((Object) str);
        }
        jSONObject.put("requestedMedia", (Object) jSONArray);
        jSONObject.put("command", (Object) "mute-participant");
        if (zad instanceof yad) {
            jSONObject.put("roomId", ((yad) zad).a);
        }
        return jSONObject;
    }

    public static JSONObject b(Map map, bg1 bg1, zad zad) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) bg1 != null ? bg1.c() : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AUDIO", (Object) f46.M((rd8) map.get(qd8.a)));
        jSONObject2.put("VIDEO", (Object) f46.M((rd8) map.get(qd8.b)));
        jSONObject2.put("SCREEN_SHARING", (Object) f46.M((rd8) map.get(qd8.c)));
        jSONObject2.put("MOVIE_SHARING", (Object) f46.M((rd8) map.get(qd8.o)));
        jSONObject.put("muteStates", (Object) jSONObject2);
        jSONObject.put("command", (Object) "mute-participant");
        if (zad instanceof yad) {
            jSONObject.put("roomId", ((yad) zad).a);
        }
        return jSONObject;
    }
}
