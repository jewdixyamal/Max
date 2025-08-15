package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: de2  reason: default package */
public final class de2 extends gle {
    public int X;
    public long Y;
    public long Z;
    public ArrayList c;
    public int o;

    public de2(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    public final void b(gy8 gy8, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -677145915:
                    if (str.equals("forward")) {
                        this.Y = gy8.w0();
                        return;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        this.c = wz.e(gy8);
                        return;
                    }
                    break;
                case 111188:
                    if (str.equals("pos")) {
                        this.o = gy8.v0();
                        return;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        this.X = gy8.v0();
                        return;
                    }
                    break;
                case 2121976803:
                    if (str.equals("backward")) {
                        this.Z = gy8.w0();
                        return;
                    }
                    break;
            }
        }
        gy8.z();
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return x53.D0(arrayList);
    }

    public final String toString() {
        int size = c().size();
        int i = this.o;
        int i2 = this.X;
        long j = this.Y;
        long j2 = this.Z;
        StringBuilder j3 = wg0.j("{messages=", size, ", pos=", i, ", total=");
        j3.append(i2);
        j3.append(", forward=");
        j3.append(j);
        j3.append(", backward=");
        j3.append(j2);
        j3.append("}");
        return j3.toString();
    }
}
