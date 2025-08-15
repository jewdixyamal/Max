package defpackage;

import java.util.List;

/* renamed from: pu6  reason: default package */
public final class pu6 {
    public static final je7 d = tu0.r(1, new fh5(17));
    public int a;
    public List b;
    public final pb4 c = new pb4();

    public pu6() {
        a();
    }

    public final void a() {
        this.a = this.c.a;
        List<nu6> list = this.b;
        if (list != null) {
            for (nu6 b2 : list) {
                this.a = Math.max(this.a, b2.b());
            }
        }
    }
}
