package defpackage;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: g7g  reason: default package */
public final class g7g extends kq0 {
    public static final String t = a14.O("WorkContinuationImpl");
    public final s7g l;
    public final String m;
    public final h65 n;
    public final List o;
    public final ArrayList p;
    public final ArrayList q = new ArrayList();
    public boolean r;
    public imc s;

    public g7g(s7g s7g, String str, h65 h65, List list) {
        this.l = s7g;
        this.m = str;
        this.n = h65;
        this.o = list;
        this.p = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String stringId = ((WorkRequest) list.get(i)).getStringId();
            this.p.add(stringId);
            this.q.add(stringId);
        }
    }

    public static HashSet N(g7g g7g) {
        HashSet hashSet = new HashSet();
        g7g.getClass();
        return hashSet;
    }

    public final pma l() {
        if (!this.r) {
            imc imc = new imc(28);
            this.l.d.l(new h25(this, imc));
            this.s = imc;
        } else {
            a14 u = a14.u();
            u.R(t, "Already enqueued work ids (" + TextUtils.join(", ", this.p) + ")");
        }
        return this.s;
    }

    public final xm7 q() {
        ArrayList<String> arrayList = this.q;
        s7g s7g = this.l;
        i8g y = s7g.c.y();
        y.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = arrayList.size();
        a14.c(sb, size);
        sb.append(")");
        xlc a = xlc.a(size, sb.toString());
        int i = 1;
        for (String str : arrayList) {
            if (str == null) {
                a.W(i);
            } else {
                a.f(i, str);
            }
            i++;
        }
        v47 v47 = ((ilc) y.a).e;
        oef oef = new oef(y, 2, a);
        String[] d = v47.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        int length = d.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = d[i2];
            if (v47.d.containsKey(str2.toLowerCase(Locale.US))) {
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str2).toString());
            }
        }
        ph4 ph4 = v47.j;
        lmc lmc = new lmc((ilc) ph4.a, ph4, oef, d);
        mu1 mu1 = h8g.v;
        wne wne = s7g.d;
        Object obj = new Object();
        bn8 bn8 = new bn8();
        bn8.l(lmc, new bn7((bkb) wne, obj, mu1, bn8));
        return bn8;
    }
}
