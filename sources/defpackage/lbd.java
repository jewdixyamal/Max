package defpackage;

import android.net.Uri;
import android.os.ConditionVariable;
import java.util.LinkedHashMap;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: lbd  reason: default package */
public final class lbd {
    public volatile ConditionVariable a;

    public final void a(yie yie, List list, kbd kbd) {
        kye kye = kye.a;
        String a2 = kye.a();
        if (a2 != null) {
            List<ls4> d = kye.b().d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buildUuid", (Object) yie.e);
            jSONObject.put("deviceId", (Object) yie.h);
            jSONObject.put("sessions", (Object) xfg.C(list));
            if (!d.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (ls4 ls4 : d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event", (Object) ls4.a);
                    jSONObject2.put("reason", (Object) ls4.b);
                    jSONObject2.put(NewHtcHomeBadger.COUNT, ls4.c);
                    jSONArray.put((Object) jSONObject2);
                }
                jSONObject.put("drops", (Object) jSONArray);
            }
            kye kye2 = kye.a;
            Object obj = kye.c().get(ote.b);
            if ((obj instanceof gx3 ? (gx3) obj : null) == null) {
                mz7.d0(new LinkedHashMap());
            }
            bkb bkb = new bkb(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", a2).toString(), (qq6) b46.o("application/json; charset=utf-8", jSONObject.toString()));
            ConditionVariable conditionVariable = new ConditionVariable();
            this.a = conditionVariable;
            hze.b(new yg3(bkb, this, (List) d, conditionVariable, kbd));
        }
    }
}
