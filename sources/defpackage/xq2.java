package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xq2  reason: default package */
public final class xq2 {
    public final List a;
    public final long b;
    public final Long c;

    public xq2(ik5 ik5) {
        this.a = (List) ik5.b;
        this.b = ik5.a;
        this.c = (Long) ik5.c;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ik5, java.lang.Object] */
    public static xq2 a(gy8 gy8) {
        int N = lz7.N(gy8);
        if (N == 0) {
            return null;
        }
        ? obj = new Object();
        ArrayList arrayList = new ArrayList(jm2.X);
        for (int i = 0; i < N; i++) {
            String z0 = gy8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -246214960:
                    if (z0.equals("dontDisturbUntil")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 107019:
                    if (z0.equals("led")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3619395:
                    if (z0.equals("vibr")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109627663:
                    if (z0.equals("sound")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1015572087:
                    if (z0.equals("favIndex")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.a = gy8.w0();
                    break;
                case 1:
                    if (!gy8.u0()) {
                        break;
                    } else {
                        arrayList.add(jm2.LED);
                        break;
                    }
                case 2:
                    if (!gy8.u0()) {
                        break;
                    } else {
                        arrayList.add(jm2.VIBRATION);
                        break;
                    }
                case 3:
                    if (!gy8.u0()) {
                        break;
                    } else {
                        arrayList.add(jm2.SOUND);
                        break;
                    }
                case 4:
                    obj.c = Long.valueOf(lz7.M(gy8, 0));
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        obj.b = arrayList;
        return new xq2(obj);
    }

    public final String toString() {
        Long l = this.c;
        String l2 = l != null ? l.toString() : "null";
        StringBuilder sb = new StringBuilder("ChatSettings{options=");
        sb.append(this.a);
        sb.append(", dontDisturbUntil=");
        ms2.j(this.b, ", favoriteIndex = ", l2, sb);
        sb.append("}");
        return sb.toString();
    }
}
