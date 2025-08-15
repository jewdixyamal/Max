package defpackage;

import android.os.Bundle;

/* renamed from: k81  reason: default package */
public final /* synthetic */ class k81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k81(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                z71 z71 = z71.c;
                long j = ((yk6) ((al6) this.c)).a;
                f64 P1 = z71.P1();
                StringBuilder k = au1.k(j, ":call-user?opponent_id=", "&video_enabled=");
                k.append(this.b);
                k.append("&microphone_enabled=true");
                P1.b(k.toString(), (Bundle) null);
                return e5f.a;
            default:
                mn1.x((mn1) this.c, this.b);
                return e5f.a;
        }
    }
}
