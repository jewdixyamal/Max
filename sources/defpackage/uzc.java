package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: uzc  reason: default package */
public final class uzc implements xzc {
    public final p82 a;
    public final el3 b;
    public final b0d c;
    public final boolean d;
    public final xzc e;
    public final xzc f;

    public uzc(p82 p82, el3 el3, b0d b0d, boolean z, vzc vzc, wzc wzc) {
        this.a = p82;
        this.b = el3;
        this.c = b0d;
        this.d = z;
        this.e = vzc;
        this.f = wzc;
    }

    public final List a(String str) {
        ArrayList arrayList = new ArrayList();
        xzc xzc = this.f;
        if (xzc != null) {
            arrayList.addAll(xzc.a(str));
        }
        try {
            gi9 gi9 = new gi9((Object) null);
            gi9 gi92 = new gi9((Object) null);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            c(str, gi9, gi92, arrayList2, arrayList3);
            ArrayList b2 = b(str, this.d, gi9, gi92);
            arrayList.addAll(arrayList2);
            arrayList.addAll(b2);
            long t = ((p7b) this.b.h).a.t();
            if (arrayList.size() > 1) {
                c63.U(arrayList, new c08(t, 1));
            }
            arrayList.addAll(arrayList3);
        } catch (Throwable th) {
            hm9.p("Fts", "failure to search", th);
        }
        if (arrayList.isEmpty()) {
            try {
                arrayList.addAll(this.e.a(str));
            } catch (Throwable th2) {
                hm9.p("Fts", "failure to search by fallback strategy", th2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList b(String str, boolean z, gi9 gi9, gi9 gi92) {
        f56 e2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2 = str;
        boolean z2 = z;
        ArrayList arrayList3 = new ArrayList();
        p82 p82 = this.a;
        elc elc = ((k24) ((c34) p82.l.get())).b;
        elc.getClass();
        boolean C0 = w9e.C0(str);
        List<Long> list = nz4.a;
        if (!C0 && (e2 = g56.e(str)) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e56 e56 = e2.a;
            e56 e562 = e56.c;
            String str3 = e56.a;
            String str4 = e56.b;
            if (e562 != null) {
                dt2 c2 = elc.c();
                e56 e563 = e56.c;
                String str5 = e563.a;
                c2.getClass();
                xlc a2 = xlc.a(4, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? OR normalizedTitleWithoutEmoji MATCH ? OR originalTitleWithoutEmoji MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str4 == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str4);
                }
                if (str3 == null) {
                    a2.W(2);
                } else {
                    a2.f(2, str3);
                }
                if (str5 == null) {
                    a2.W(3);
                } else {
                    a2.f(3, str5);
                }
                String str6 = e563.b;
                if (str6 == null) {
                    a2.W(4);
                } else {
                    a2.f(4, str6);
                }
                ilc ilc = c2.a;
                ilc.b();
                Cursor o = ilc.o(a2, (CancellationSignal) null);
                try {
                    arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                    }
                } finally {
                    o.close();
                    a2.n();
                }
            } else {
                dt2 c3 = elc.c();
                c3.getClass();
                xlc a3 = xlc.a(2, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str4 == null) {
                    a3.W(1);
                } else {
                    a3.f(1, str4);
                }
                if (str3 == null) {
                    a3.W(2);
                } else {
                    a3.f(2, str3);
                }
                ilc ilc2 = c3.a;
                ilc2.b();
                Cursor o2 = ilc2.o(a3, (CancellationSignal) null);
                try {
                    ArrayList arrayList4 = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList4.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
                    }
                    o2.close();
                    a3.n();
                    arrayList = arrayList4;
                } catch (Throwable th) {
                    o2.close();
                    a3.n();
                    throw th;
                }
            }
            linkedHashSet.addAll(arrayList);
            e56 e564 = e2.b;
            e56 e565 = e564.c;
            String str7 = e564.a;
            String str8 = e564.b;
            if (e565 != null) {
                dt2 c4 = elc.c();
                e56 e566 = e564.c;
                String str9 = e566.a;
                c4.getClass();
                xlc a4 = xlc.a(4, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? OR normalizedTitleWithoutEmoji LIKE ? OR originalTitleWithoutEmoji LIKE ? ORDER BY sortTime DESC ");
                if (str8 == null) {
                    a4.W(1);
                } else {
                    a4.f(1, str8);
                }
                if (str7 == null) {
                    a4.W(2);
                } else {
                    a4.f(2, str7);
                }
                if (str9 == null) {
                    a4.W(3);
                } else {
                    a4.f(3, str9);
                }
                String str10 = e566.b;
                if (str10 == null) {
                    a4.W(4);
                } else {
                    a4.f(4, str10);
                }
                ilc ilc3 = c4.a;
                ilc3.b();
                Cursor o3 = ilc3.o(a4, (CancellationSignal) null);
                try {
                    arrayList2 = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        arrayList2.add(o3.isNull(0) ? null : Long.valueOf(o3.getLong(0)));
                    }
                } finally {
                    o3.close();
                    a4.n();
                }
            } else {
                dt2 c5 = elc.c();
                c5.getClass();
                xlc a5 = xlc.a(2, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? ORDER BY sortTime DESC ");
                if (str8 == null) {
                    a5.W(1);
                } else {
                    a5.f(1, str8);
                }
                if (str7 == null) {
                    a5.W(2);
                } else {
                    a5.f(2, str7);
                }
                ilc ilc4 = c5.a;
                ilc4.b();
                Cursor o4 = ilc4.o(a5, (CancellationSignal) null);
                try {
                    arrayList2 = new ArrayList(o4.getCount());
                    while (o4.moveToNext()) {
                        arrayList2.add(o4.isNull(0) ? null : Long.valueOf(o4.getLong(0)));
                    }
                } finally {
                    o4.close();
                    a5.n();
                }
            }
            linkedHashSet.addAll(arrayList2);
            list = x53.D0(linkedHashSet);
        }
        if (!nd7.D(list)) {
            EnumSet enumSet = z2 ? p82.M : p82.L;
            for (Long longValue : list) {
                e52 C = p82.C(longValue.longValue());
                if (C != null && p82.m(C, enumSet, z2, ((p7b) p82.n).e)) {
                    try {
                        if (C.C()) {
                            try {
                                if (gi92.d(C.a)) {
                                    gi9 gi93 = gi9;
                                } else {
                                    uj3 l = C.l();
                                    b0d b0d = this.c;
                                    if (l != null) {
                                        if (!gi9.d(l.n())) {
                                            arrayList3.add(b0d.a(C, str2));
                                        }
                                    } else {
                                        gi9 gi94 = gi9;
                                    }
                                    arrayList3.add(b0d.a(C, str2));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                hm9.p("p82", "iterateChatsByQuery fail", th);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gi9 gi95 = gi9;
                        gi9 gi96 = gi92;
                        hm9.p("p82", "iterateChatsByQuery fail", th);
                    }
                }
                gi9 gi97 = gi9;
                gi9 gi98 = gi92;
            }
        }
        if (arrayList3.size() > 1) {
            c63.U(arrayList3, new ky6(11));
        }
        return arrayList3;
    }

    public final void c(String str, gi9 gi9, gi9 gi92, ArrayList arrayList, ArrayList arrayList2) {
        f56 e2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str2 = str;
        el3 el3 = this.b;
        glc glc = ((k24) ((c34) el3.f.get())).d;
        glc.getClass();
        boolean C0 = w9e.C0(str);
        List<Long> list = nz4.a;
        if (!C0 && (e2 = g56.e(str)) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e56 e56 = e2.a;
            e56 e562 = e56.c;
            String str3 = e56.a;
            String str4 = e56.b;
            if (e562 != null) {
                ir3 h = glc.h();
                e56 e563 = e56.c;
                String str5 = e563.a;
                h.getClass();
                xlc a2 = xlc.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ? OR allNormalizedTitlesWithoutEmoji MATCH ? OR allOriginalTitlesWithoutEmoji MATCH ? || '*')");
                if (str4 == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str4);
                }
                if (str3 == null) {
                    a2.W(2);
                } else {
                    a2.f(2, str3);
                }
                if (str3 == null) {
                    a2.W(3);
                } else {
                    a2.f(3, str3);
                }
                if (str5 == null) {
                    a2.W(4);
                } else {
                    a2.f(4, str5);
                }
                String str6 = e563.b;
                if (str6 == null) {
                    a2.W(5);
                } else {
                    a2.f(5, str6);
                }
                ilc ilc = h.a;
                ilc.b();
                Cursor o = ilc.o(a2, (CancellationSignal) null);
                try {
                    arrayList3 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList3.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                    }
                } finally {
                    o.close();
                    a2.n();
                }
            } else {
                ir3 h2 = glc.h();
                h2.getClass();
                xlc a3 = xlc.a(3, "SELECT docid FROM contact_title WHERE allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ?");
                if (str4 == null) {
                    a3.W(1);
                } else {
                    a3.f(1, str4);
                }
                if (str3 == null) {
                    a3.W(2);
                } else {
                    a3.f(2, str3);
                }
                if (str3 == null) {
                    a3.W(3);
                } else {
                    a3.f(3, str3);
                }
                ilc ilc2 = h2.a;
                ilc2.b();
                Cursor o2 = ilc2.o(a3, (CancellationSignal) null);
                try {
                    arrayList3 = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList3.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
                    }
                } finally {
                    o2.close();
                    a3.n();
                }
            }
            linkedHashSet.addAll(arrayList3);
            e56 e564 = e2.b;
            e56 e565 = e564.c;
            String str7 = e564.a;
            String str8 = e564.b;
            if (e565 != null) {
                ir3 h3 = glc.h();
                e56 e566 = e564.c;
                String str9 = e566.a;
                h3.getClass();
                xlc a4 = xlc.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ? OR allNormalizedTitlesWithoutEmoji LIKE ? OR allOriginalTitlesWithoutEmoji LIKE ?)");
                if (str8 == null) {
                    a4.W(1);
                } else {
                    a4.f(1, str8);
                }
                if (str7 == null) {
                    a4.W(2);
                } else {
                    a4.f(2, str7);
                }
                if (str7 == null) {
                    a4.W(3);
                } else {
                    a4.f(3, str7);
                }
                if (str9 == null) {
                    a4.W(4);
                } else {
                    a4.f(4, str9);
                }
                String str10 = e566.b;
                if (str10 == null) {
                    a4.W(5);
                } else {
                    a4.f(5, str10);
                }
                ilc ilc3 = h3.a;
                ilc3.b();
                Cursor o3 = ilc3.o(a4, (CancellationSignal) null);
                try {
                    arrayList4 = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        arrayList4.add(o3.isNull(0) ? null : Long.valueOf(o3.getLong(0)));
                    }
                } finally {
                    o3.close();
                    a4.n();
                }
            } else {
                ir3 h4 = glc.h();
                h4.getClass();
                xlc a5 = xlc.a(3, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ?)");
                if (str8 == null) {
                    a5.W(1);
                } else {
                    a5.f(1, str8);
                }
                if (str7 == null) {
                    a5.W(2);
                } else {
                    a5.f(2, str7);
                }
                if (str7 == null) {
                    a5.W(3);
                } else {
                    a5.f(3, str7);
                }
                ilc ilc4 = h4.a;
                ilc4.b();
                Cursor o4 = ilc4.o(a5, (CancellationSignal) null);
                try {
                    arrayList4 = new ArrayList(o4.getCount());
                    while (o4.moveToNext()) {
                        arrayList4.add(o4.isNull(0) ? null : Long.valueOf(o4.getLong(0)));
                    }
                } finally {
                    o4.close();
                    a5.n();
                }
            }
            linkedHashSet.addAll(arrayList4);
            list = x53.D0(linkedHashSet);
        }
        if (!nd7.D(list)) {
            uj3 i = el3.i(((p7b) el3.h).a.t(), false);
            for (Long l : list) {
                uj3 uj3 = (uj3) el3.a.get(l);
                if (!(uj3 == null || i == null || uj3 == i)) {
                    if (el3.s.contains(uj3.a.c.k)) {
                        try {
                            e52 F = this.a.F(uj3.n());
                            b0d b0d = this.c;
                            if (F == null || !F.C()) {
                                gi9 gi93 = gi9;
                                gi9 gi94 = gi92;
                                ArrayList arrayList5 = arrayList;
                                try {
                                    arrayList2.add(b0d.b(uj3, str2));
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } else {
                                try {
                                    arrayList.add(b0d.a(F, str2));
                                } catch (Throwable th2) {
                                    th = th2;
                                    gi9 gi95 = gi9;
                                    gi9 gi96 = gi92;
                                    ArrayList arrayList6 = arrayList2;
                                    hm9.p("ContactController", "iterateContactsByQuery fail", th);
                                }
                                try {
                                    gi92.a(F.a);
                                    gi9.a(uj3.n());
                                    ArrayList arrayList7 = arrayList2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    ArrayList arrayList62 = arrayList2;
                                    hm9.p("ContactController", "iterateContactsByQuery fail", th);
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            gi9 gi97 = gi9;
                            gi9 gi98 = gi92;
                            ArrayList arrayList8 = arrayList;
                            ArrayList arrayList622 = arrayList2;
                            hm9.p("ContactController", "iterateContactsByQuery fail", th);
                        }
                    }
                }
                gi9 gi99 = gi9;
                gi9 gi910 = gi92;
                ArrayList arrayList9 = arrayList;
                ArrayList arrayList72 = arrayList2;
            }
        }
    }
}
