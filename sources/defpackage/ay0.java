package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: ay0  reason: default package */
public final /* synthetic */ class ay0 implements qod {
    public final /* synthetic */ Runnable X;
    public final /* synthetic */ Runnable Y;
    public final /* synthetic */ py0 a;
    public final /* synthetic */ bg1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List o;

    public /* synthetic */ ay0(py0 py0, bg1 bg1, boolean z, List list, Runnable runnable, Runnable runnable2) {
        this.a = py0;
        this.b = bg1;
        this.c = z;
        this.o = list;
        this.X = runnable;
        this.Y = runnable2;
    }

    public final void j(JSONObject jSONObject) {
        fg1 fg1;
        py0 py0 = this.a;
        py0.getClass();
        if (jSONObject.optString("error").isEmpty()) {
            kg1 kg1 = py0.p1;
            kg1.getClass();
            LinkedHashSet<fg1> linkedHashSet = new LinkedHashSet<>();
            fg1 fg12 = kg1.a;
            bg1 bg1 = fg12.a;
            bg1 bg12 = this.b;
            if (bg1 == null || !bg1.equals(bg12)) {
                Set<bg1> set = (Set) kg1.h.get(bg12.a);
                if (set != null) {
                    for (bg1 bg13 : set) {
                        zad zad = (zad) kg1.g.get(bg13);
                        if (!(zad == null || (fg1 = (fg1) kg1.d(zad).get(bg13)) == null)) {
                            linkedHashSet.add(fg1);
                        }
                    }
                }
            } else {
                linkedHashSet.add(fg12);
            }
            if (!linkedHashSet.isEmpty()) {
                for (fg1 fg13 : linkedHashSet) {
                    boolean z = this.c;
                    List list = this.o;
                    if (z) {
                        fg13.d.removeAll(list);
                    } else {
                        fg13.d.addAll(list);
                    }
                }
                py0.k(w51.H0, linkedHashSet);
            }
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Runnable runnable2 = this.Y;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
