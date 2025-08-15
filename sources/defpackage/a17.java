package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: a17  reason: default package */
public final class a17 extends bz {
    public final String X;
    public final jc7 o;

    public a17(jc7 jc7, String str, boolean z, boolean z2) {
        super(b10.INLINE_KEYBOARD, z, z2);
        this.o = jc7;
        this.X = str;
    }

    public final HashMap a() {
        HashMap a = super.a();
        ArrayList arrayList = new ArrayList();
        for (List<gv0> it : (List) this.o.a) {
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (gv0 gv0 : it) {
                gv0.getClass();
                HashMap hashMap = new HashMap();
                String str = gv0.o;
                if (str != null) {
                    hashMap.put("url", str);
                }
                hashMap.put("type", gv0.a.a);
                hashMap.put("text", gv0.b);
                hashMap.put("intent", gv0.c.a);
                hashMap.put(ApiProtocol.PARAM_PAYLOAD, gv0.X);
                hashMap.put("isQuick", Boolean.valueOf(gv0.Y));
                hashMap.put("contactId", Long.valueOf(gv0.Z));
                arrayList2.add(hashMap);
            }
        }
        a.put("buttons", arrayList);
        return a;
    }
}
