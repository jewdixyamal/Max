package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* renamed from: fm5  reason: default package */
public final class fm5 implements xn0, sne {
    public static final fm5 c = new fm5(0, 1);
    public static final fm5 d = new fm5(0, 2);
    public static final fm5 e = new fm5(0, 3);
    public static final fm5 f = new fm5(1, 3);
    public static final fm5 g = new fm5(2, 3);
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ fm5(int i) {
        this.a = i;
    }

    public int a(int i) {
        int i2 = this.b;
        int i3 = i % i2;
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i2 + i3;
    }

    public boolean b(int i) {
        int i2 = this.b;
        return i2 != 0 && (i2 & i) == i;
    }

    public void h() {
    }

    public void i(l84 l84, wn0 wn0, vf vfVar, int i, k56 k56) {
        int i2 = this.b;
        int i3 = 1;
        if (1 <= i2) {
            while (true) {
                int x = (i + i3) % vfVar.x();
                if (ta5.a.i(2)) {
                    ta5.e(fm5.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(x), Integer.valueOf(i));
                }
                int hashCode = (vfVar.hashCode() * 31) + x;
                synchronized (((SparseArray) l84.e)) {
                    if (((SparseArray) l84.e).get(hashCode) != null) {
                        ta5.d(l84.class, Integer.valueOf(x), "Already scheduled decode job for frame %d");
                    } else if (wn0.a(x)) {
                        ta5.d(l84.class, Integer.valueOf(x), "Frame %d is cached already.");
                    } else {
                        k84 k84 = new k84(l84, vfVar, wn0, x, hashCode);
                        ((SparseArray) l84.e).put(hashCode, k84);
                        ((ExecutorService) l84.d).execute(k84);
                    }
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        if (k56 != null) {
            k56.invoke();
        }
    }

    public o43 j(int i, int i2, int i3) {
        return null;
    }

    public void k() {
    }

    public void l(int i, int i2) {
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Restrictions{restrictions=" + this.b + ", cannotInvite=" + b(1) + ", cannotModifyIcon=" + b(2) + ", cannotModifyTitle=" + b(4) + ", cannotLeave=" + b(8) + ", cannotPin=" + b(16) + ", cannotLiveLocation=" + b(32) + ", cannotInput=" + b(64) + ", cannotStopBot=" + b(128) + ", cannotComplain=" + b(256) + '}';
            case 3:
                return zr6.j(new StringBuilder("{value="), this.b, "}");
            case 7:
                return String.format((Locale) null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fm5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public /* synthetic */ fm5(boolean z) {
        this.a = 9;
    }
}
