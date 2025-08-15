package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lnb3;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public List<nb3> getComponents() {
        Class<le0> cls = le0.class;
        Class<nx3> cls2 = nx3.class;
        ob8 a = nb3.a(new lqb(cls, cls2));
        Class<Executor> cls3 = Executor.class;
        a.a(new nh4(new lqb(cls, cls3), 1, 0));
        a.f = qx7.o;
        nb3 b = a.b();
        Class<kh7> cls4 = kh7.class;
        ob8 a2 = nb3.a(new lqb(cls4, cls2));
        a2.a(new nh4(new lqb(cls4, cls3), 1, 0));
        a2.f = yb9.c;
        nb3 b2 = a2.b();
        Class<ip0> cls5 = ip0.class;
        ob8 a3 = nb3.a(new lqb(cls5, cls2));
        a3.a(new nh4(new lqb(cls5, cls3), 1, 0));
        a3.f = mq9.X;
        nb3 b3 = a3.b();
        Class<u4f> cls6 = u4f.class;
        ob8 a4 = nb3.a(new lqb(cls6, cls2));
        a4.a(new nh4(new lqb(cls6, cls3), 1, 0));
        a4.f = pq9.u0;
        return y53.M(b, b2, b3, a4.b());
    }
}
