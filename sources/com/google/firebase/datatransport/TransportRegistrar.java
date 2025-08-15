package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<nb3> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<l2f> cls = l2f.class;
        hashSet.add(lqb.a(cls));
        for (Class cls2 : new Class[0]) {
            a14.h(cls2, "Null interface");
            hashSet.add(lqb.a(cls2));
        }
        Class<Context> cls3 = Context.class;
        nh4 a = nh4.a(cls3);
        if (!hashSet.contains(a.a)) {
            hashSet2.add(a);
            nb3 nb3 = new nb3(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new hme(29), hashSet3);
            ob8 a2 = nb3.a(new lqb(of7.class, cls));
            a2.a(nh4.a(cls3));
            a2.f = new n2f(0);
            nb3 b = a2.b();
            ob8 a3 = nb3.a(new lqb(j2f.class, cls));
            a3.a(nh4.a(cls3));
            a3.f = new n2f(1);
            return Arrays.asList(new nb3[]{nb3, b, a3.b(), a14.l(LIBRARY_NAME, "18.2.0")});
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
