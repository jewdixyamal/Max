package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fj4  reason: default package */
public abstract class fj4 {
    public static final String a = a14.O("DiagnosticsWrkr");

    /* JADX INFO: finally extract failed */
    public static final String a(y7g y7g, k8g k8g, die die, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h8g h8g = (h8g) it.next();
            cie x = die.x(ju0.n(h8g));
            Integer valueOf = x != null ? Integer.valueOf(x.c) : null;
            y7g.getClass();
            xlc a2 = xlc.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str = h8g.a;
            if (str == null) {
                a2.W(1);
            } else {
                a2.f(1, str);
            }
            ilc ilc = (ilc) y7g.b;
            ilc.b();
            Cursor o = ilc.o(a2, (CancellationSignal) null);
            try {
                ArrayList arrayList2 = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    arrayList2.add(o.isNull(0) ? null : o.getString(0));
                }
                o.close();
                a2.n();
                String n0 = x53.n0(arrayList2, ",", (String) null, (String) null, (m56) null, 62);
                String n02 = x53.n0(k8g.r(str), ",", (String) null, (String) null, (m56) null, 62);
                StringBuilder m = au1.m("\n", str, "\t ");
                m.append(h8g.c);
                m.append("\t ");
                m.append(valueOf);
                m.append("\t ");
                m.append(h8g.b.name());
                m.append("\t ");
                m.append(n0);
                m.append("\t ");
                m.append(n02);
                m.append(9);
                sb.append(m.toString());
            } catch (Throwable th) {
                o.close();
                a2.n();
                throw th;
            }
        }
        return sb.toString();
    }
}
