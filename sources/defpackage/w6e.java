package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: w6e  reason: default package */
public final class w6e extends pnf {
    public static final /* synthetic */ bc7[] B0;
    public final w4d A0 = mqd.D();
    public final q0e X;
    public final w7c Y;
    public final s35 Z = new s35(0);
    public final Context b;
    public final kke c;
    public final je7 o;
    public final s35 s0 = new s35(0);
    public volatile Long t0;
    public volatile int u0 = -1;
    public volatile Long v0;
    public final w4d w0 = mqd.D();
    public Long x0;
    public Long y0;
    public final w4d z0 = mqd.D();

    static {
        Class<w6e> cls = w6e.class;
        B0 = new bc7[]{new oi9(cls, "moveFinishJob", "getMoveFinishJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "menuItemJob", "getMenuItemJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    }

    public w6e(Context context, kke kke, je7 je7, je7 je72, je7 je73) {
        this.b = context;
        this.c = kke;
        this.o = je73;
        q0e a = r0e.a(nz4.a);
        this.X = a;
        this.Y = new w7c(a);
        hm9.m(w6e.class.getName(), "loadSections", new Object[0]);
        kq1 c2 = c37.c(((o2e) je7.getValue()).a());
        kq1 c3 = c37.c(((md5) je72.getValue()).a());
        ml0 ml0 = ((sc5) je73.getValue()).s0;
        ml0.getClass();
        od2.L(od2.F(new zn5(od2.t(c2, c3, c37.c(new e0a(new mz9(ml0, 0), new nc5(23), 3)), new zp3(4, (Continuation) null)), new shb(2, this, w6e.class, "processResult", "processResult(Lone/me/stickerssettings/StickersSettingsViewModel$CombinedResult;)V", 4, 16), 5), ((w9a) kke).b()), this.a);
    }

    public final String q(List list) {
        int size = list != null ? list.size() : 0;
        return this.b.getResources().getQuantityString(uga.a, size, new Object[]{Integer.valueOf(size)});
    }
}
