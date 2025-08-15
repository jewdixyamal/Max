package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<ef4> cls = ef4.class;
        hashSet.add(lqb.a(cls));
        for (Class cls2 : new Class[0]) {
            a14.h(cls2, "Null interface");
            hashSet.add(lqb.a(cls2));
        }
        nh4 nh4 = new nh4(2, 0, va0.class);
        if (!hashSet.contains(nh4.a)) {
            hashSet2.add(nh4);
            arrayList.add(new nb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ta4(4), hashSet3));
            lqb lqb = new lqb(le0.class, Executor.class);
            ob8 ob8 = new ob8(bb4.class, new Class[]{lj6.class, mj6.class});
            ob8.a(nh4.a(Context.class));
            ob8.a(nh4.a(fl5.class));
            ob8.a(new nh4(2, 0, kj6.class));
            ob8.a(new nh4(1, 1, (Class) cls));
            ob8.a(new nh4(lqb, 1, 0));
            ob8.f = new za4(lqb, 0);
            arrayList.add(ob8.b());
            arrayList.add(a14.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
            arrayList.add(a14.l("fire-core", "21.0.0"));
            arrayList.add(a14.l("device-name", a(Build.PRODUCT)));
            arrayList.add(a14.l("device-model", a(Build.DEVICE)));
            arrayList.add(a14.l("device-brand", a(Build.BRAND)));
            arrayList.add(a14.t("android-target-sdk", new ig5(7)));
            arrayList.add(a14.t("android-min-sdk", new ig5(8)));
            arrayList.add(a14.t("android-platform", new ig5(9)));
            arrayList.add(a14.t("android-installer", new ig5(10)));
            try {
                md7.b.getClass();
                str = "2.0.20";
            } catch (NoClassDefFoundError unused) {
                str = null;
            }
            if (str != null) {
                arrayList.add(a14.l("kotlin", str));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
