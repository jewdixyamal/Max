package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static jl5 lambda$getComponents$0(zb3 zb3) {
        return new il5((fl5) zb3.a(fl5.class), zb3.c(lj6.class), (ExecutorService) zb3.f(new lqb(le0.class, ExecutorService.class)), new p6d((Executor) zb3.f(new lqb(ip0.class, Executor.class))));
    }

    public List<nb3> getComponents() {
        ob8 ob8 = new ob8(jl5.class, new Class[0]);
        ob8.b = LIBRARY_NAME;
        ob8.a(nh4.a(fl5.class));
        ob8.a(new nh4(0, 1, lj6.class));
        ob8.a(new nh4(new lqb(le0.class, ExecutorService.class), 1, 0));
        ob8.a(new nh4(new lqb(ip0.class, Executor.class), 1, 0));
        ob8.f = new ig5(11);
        nb3 b = ob8.b();
        kj6 kj6 = new kj6(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(kj6.class));
        return Arrays.asList(new nb3[]{b, new nb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new v02(15, kj6), hashSet3), a14.l(LIBRARY_NAME, "18.0.0")});
    }
}
