package defpackage;

import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: bv4  reason: default package */
public final class bv4 {
    public final au8 a;
    public final p82 b;
    public final t6b c;
    public final av0 d;
    public final q33 e;

    public bv4(au8 au8, p82 p82, t6b t6b, av0 av0, q33 q33) {
        this.a = au8;
        this.b = p82;
        this.c = t6b;
        this.d = av0;
        this.e = q33;
    }

    public final void a(long j, long j2, String str, List list, vx8 vx8, List list2, boolean z) {
        long j3;
        long j4 = j;
        long j5 = j2;
        this.c.c.remove(Long.valueOf(j));
        av4 av4 = r0;
        av4 av42 = new av4(this, j, ((hyc) this.e).n(), z, list2, str, list, vx8);
        au8 au8 = this.a;
        ((OneMeRoomDatabase) ((k24) au8.a).c.a.m()).p(new dlc(1, av4));
        p82 p82 = this.b;
        e52 C = p82.C(j5);
        if (C != null) {
            j3 = j;
            if (C.b.j == j3) {
                p82.k0(j5, au8.q(j3), true);
            }
        } else {
            j3 = j;
        }
        if (!(C == null || C.b.L != j3 || au8.q(j3) == null)) {
            p82.o0(j5);
        }
        this.d.c(new l6f(j2, j, 0));
    }
}
