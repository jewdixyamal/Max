package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: wz  reason: default package */
public final class wz extends ArrayList {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz a(gy8 gy8) {
        ? arrayList = new ArrayList();
        int s0 = gy8.s0();
        for (int i = 0; i < s0; i++) {
            arrayList.add(bz.b(gy8));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz b(gy8 gy8) {
        int s0 = gy8.s0();
        ? arrayList = new ArrayList(s0);
        for (int i = 0; i < s0; i++) {
            arrayList.add(f52.a(gy8));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz c(gy8 gy8) {
        int G = lz7.G(gy8);
        ? arrayList = new ArrayList(G);
        for (int i = 0; i < G; i++) {
            wm3 e = wm3.e(gy8);
            wm3 wm3 = um3.A0;
            if (e == null) {
                Objects.requireNonNull(wm3, "defaultObj");
                e = wm3;
            }
            arrayList.add(e);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz d(gy8 gy8) {
        int G = lz7.G(gy8);
        ? arrayList = new ArrayList(G);
        for (int i = 0; i < G; i++) {
            arrayList.add(Long.valueOf(lz7.M(gy8, 0)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz e(gy8 gy8) {
        ? arrayList = new ArrayList();
        int G = lz7.G(gy8);
        for (int i = 0; i < G; i++) {
            arrayList.add(tpa.z(gy8));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz f(gy8 gy8) {
        int G = lz7.G(gy8);
        ? arrayList = new ArrayList(G);
        for (int i = 0; i < G; i++) {
            int N = lz7.N(gy8);
            fs8 fs8 = null;
            String str = null;
            ArrayList arrayList2 = null;
            long j = 0;
            for (int i2 = 0; i2 < N; i2++) {
                String z0 = gy8.z0();
                z0.getClass();
                char c = 65535;
                switch (z0.hashCode()) {
                    case -1361631597:
                        if (z0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -191501435:
                        if (z0.equals("feedback")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 357304895:
                        if (z0.equals("highlights")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 954925063:
                        if (z0.equals("message")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        j = gy8.w0();
                        break;
                    case 1:
                        str = gy8.z0();
                        break;
                    case 2:
                        int G2 = lz7.G(gy8);
                        ArrayList arrayList3 = new ArrayList(G2);
                        for (int i3 = 0; i3 < G2; i3++) {
                            arrayList3.add(gy8.z0());
                        }
                        arrayList2 = arrayList3;
                        break;
                    case 3:
                        fs8 = tpa.z(gy8);
                        break;
                    default:
                        gy8.z();
                        break;
                }
            }
            nx8 nx8 = new nx8(str, arrayList2, j, fs8);
            if (fs8 != null) {
                arrayList.add(nx8);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public static wz g(gy8 gy8) {
        int G = lz7.G(gy8);
        ? arrayList = new ArrayList(G);
        for (int i = 0; i < G; i++) {
            arrayList.add(lz7.P(gy8));
        }
        return arrayList;
    }
}
