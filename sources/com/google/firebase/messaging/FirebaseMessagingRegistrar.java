package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Keep
    public List<nb3> getComponents() {
        lqb lqb = new lqb(j2f.class, l2f.class);
        boolean z = false;
        ob8 ob8 = new ob8(FirebaseMessaging.class, new Class[0]);
        ob8.b = LIBRARY_NAME;
        ob8.a(nh4.a(fl5.class));
        ob8.a(new nh4(0, 0, kl5.class));
        ob8.a(new nh4(0, 1, ef4.class));
        ob8.a(new nh4(0, 1, mj6.class));
        ob8.a(nh4.a(jl5.class));
        ob8.a(new nh4(lqb, 0, 1));
        ob8.a(nh4.a(wae.class));
        ob8.f = new za4(lqb, 1);
        if (ob8.d == 0) {
            z = true;
        }
        if (z) {
            ob8.d = 1;
            return Arrays.asList(new nb3[]{ob8.b(), a14.l(LIBRARY_NAME, "24.0.1")});
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
