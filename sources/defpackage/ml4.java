package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import one.me.rlottie.RLottie;

/* renamed from: ml4  reason: default package */
public final class ml4 {
    public static ArrayList j;
    public static ml4 k;
    public static final ArrayList l = new ArrayList();
    public static final wdg m = new wdg(2);
    public final ArrayList a = new ArrayList(10);
    public final SparseIntArray b = new SparseIntArray();
    public final ArrayList c = new ArrayList(10);
    public final int d;
    public int e;
    public final int f;
    public int g;
    public boolean h;
    public final re i = new re(16, this);

    public ml4(int i2) {
        this.d = i2;
        this.f = ll4.j.nextInt();
    }

    public static void a(Runnable runnable, boolean z) {
        if (!he.b()) {
            RLottie.getLogger().o(new RuntimeException("wrong thread"));
            return;
        }
        ArrayList arrayList = j;
        wdg wdg = m;
        if (arrayList == null) {
            ArrayList arrayList2 = l;
            if (!arrayList2.isEmpty()) {
                j = (ArrayList) arrayList2.remove(arrayList2.size() - 1);
            } else {
                j = new ArrayList(100);
            }
            if (!z) {
                he.d(wdg);
            }
        }
        j.add(runnable);
        if (z) {
            he.a.removeCallbacks(wdg);
            wdg.run();
        }
    }
}
