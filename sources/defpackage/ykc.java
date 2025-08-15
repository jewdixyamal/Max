package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ykc  reason: default package */
public final class ykc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ alc c;

    public /* synthetic */ ykc(alc alc, xlc xlc, int i) {
        this.a = i;
        this.c = alc;
        this.b = xlc;
    }

    public final Object call() {
        int i;
        List list;
        xlc xlc;
        int i2;
        List list2;
        xlc xlc2;
        int i3;
        List list3;
        Long l;
        List list4 = nz4.a;
        xlc xlc3 = this.b;
        List list5 = list4;
        alc alc = this.c;
        switch (this.a) {
            case 0:
                String str = "isRemoved";
                Cursor o = alc.a.o(xlc3, (CancellationSignal) null);
                try {
                    int n = tfg.n(o, "id");
                    int n2 = tfg.n(o, "title");
                    int n3 = tfg.n(o, "emoji");
                    int n4 = tfg.n(o, "order");
                    int n5 = tfg.n(o, "filters");
                    int n6 = tfg.n(o, "isHiddenForAllFolder");
                    int n7 = tfg.n(o, "hideIfEmpty");
                    int n8 = tfg.n(o, "elements");
                    int n9 = tfg.n(o, "creatorId");
                    int n10 = tfg.n(o, "filterSubjects");
                    int n11 = tfg.n(o, "widgets");
                    int n12 = tfg.n(o, "options");
                    int n13 = tfg.n(o, str);
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        String string = o.isNull(n) ? null : o.getString(n);
                        String string2 = o.isNull(n2) ? null : o.getString(n2);
                        String string3 = o.isNull(n3) ? null : o.getString(n3);
                        int i4 = o.getInt(n4);
                        EnumSet I = dy7.I(o.isNull(n5) ? null : o.getString(n5));
                        boolean z = o.getInt(n6) != 0;
                        boolean z2 = o.getInt(n7) != 0;
                        byte[] blob = o.isNull(n8) ? null : o.getBlob(n8);
                        if (blob != null) {
                            i = n;
                            Protos.MessageElements messageElements = new Protos.MessageElements();
                            qw8.mergeFrom(messageElements, blob);
                            list = ou8.a(messageElements.elements);
                        } else {
                            i = n;
                            list = list5;
                        }
                        arrayList.add(new nkc(string, string2, string3, i4, (Set) I, z, z2, list, o.isNull(n9) ? null : Long.valueOf(o.getLong(n9)), dy7.q(o.isNull(n10) ? null : o.getBlob(n10)), dy7.s(o.isNull(n11) ? null : o.getBlob(n11)), dy7.r(o.isNull(n12) ? null : o.getBlob(n12)), o.getInt(n13) != 0));
                        n = i;
                    }
                    return arrayList;
                } finally {
                    o.close();
                }
            case 1:
                xlc xlc4 = xlc3;
                String str2 = "isRemoved";
                Cursor o2 = alc.a.o(xlc3, (CancellationSignal) null);
                try {
                    int n14 = tfg.n(o2, "id");
                    int n15 = tfg.n(o2, "title");
                    int n16 = tfg.n(o2, "emoji");
                    int n17 = tfg.n(o2, "order");
                    int n18 = tfg.n(o2, "filters");
                    int n19 = tfg.n(o2, "isHiddenForAllFolder");
                    int n20 = tfg.n(o2, "hideIfEmpty");
                    int n21 = tfg.n(o2, "elements");
                    int n22 = tfg.n(o2, "creatorId");
                    int n23 = tfg.n(o2, "filterSubjects");
                    int n24 = tfg.n(o2, "widgets");
                    int n25 = tfg.n(o2, "options");
                    int n26 = tfg.n(o2, str2);
                    xlc = xlc3;
                    try {
                        ArrayList arrayList2 = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            String string4 = o2.isNull(n14) ? null : o2.getString(n14);
                            String string5 = o2.isNull(n15) ? null : o2.getString(n15);
                            String string6 = o2.isNull(n16) ? null : o2.getString(n16);
                            int i5 = o2.getInt(n17);
                            EnumSet I2 = dy7.I(o2.isNull(n18) ? null : o2.getString(n18));
                            boolean z3 = o2.getInt(n19) != 0;
                            boolean z4 = o2.getInt(n20) != 0;
                            byte[] blob2 = o2.isNull(n21) ? null : o2.getBlob(n21);
                            if (blob2 != null) {
                                i2 = n14;
                                Protos.MessageElements messageElements2 = new Protos.MessageElements();
                                qw8.mergeFrom(messageElements2, blob2);
                                list2 = ou8.a(messageElements2.elements);
                            } else {
                                i2 = n14;
                                list2 = list5;
                            }
                            arrayList2.add(new nkc(string4, string5, string6, i5, (Set) I2, z3, z4, list2, o2.isNull(n22) ? null : Long.valueOf(o2.getLong(n22)), dy7.q(o2.isNull(n23) ? null : o2.getBlob(n23)), dy7.s(o2.isNull(n24) ? null : o2.getBlob(n24)), dy7.r(o2.isNull(n25) ? null : o2.getBlob(n25)), o2.getInt(n26) != 0));
                            n14 = i2;
                        }
                        o2.close();
                        xlc.n();
                        return arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        o2.close();
                        xlc.n();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xlc = xlc3;
                    o2.close();
                    xlc.n();
                    throw th;
                }
            case 2:
                Cursor o3 = alc.a.o(xlc3, (CancellationSignal) null);
                try {
                    int n27 = tfg.n(o3, "id");
                    int n28 = tfg.n(o3, "title");
                    int n29 = tfg.n(o3, "emoji");
                    int n30 = tfg.n(o3, "order");
                    int n31 = tfg.n(o3, "filters");
                    int n32 = tfg.n(o3, "isHiddenForAllFolder");
                    int n33 = tfg.n(o3, "hideIfEmpty");
                    int n34 = tfg.n(o3, "elements");
                    int n35 = tfg.n(o3, "creatorId");
                    int n36 = tfg.n(o3, "filterSubjects");
                    int n37 = tfg.n(o3, "widgets");
                    int n38 = tfg.n(o3, "options");
                    int n39 = tfg.n(o3, "isRemoved");
                    xlc2 = xlc3;
                    try {
                        ArrayList arrayList3 = new ArrayList(o3.getCount());
                        while (o3.moveToNext()) {
                            String string7 = o3.isNull(n27) ? null : o3.getString(n27);
                            String string8 = o3.isNull(n28) ? null : o3.getString(n28);
                            String string9 = o3.isNull(n29) ? null : o3.getString(n29);
                            int i6 = o3.getInt(n30);
                            EnumSet I3 = dy7.I(o3.isNull(n31) ? null : o3.getString(n31));
                            boolean z5 = o3.getInt(n32) != 0;
                            boolean z6 = o3.getInt(n33) != 0;
                            byte[] blob3 = o3.isNull(n34) ? null : o3.getBlob(n34);
                            if (blob3 != null) {
                                i3 = n27;
                                Protos.MessageElements messageElements3 = new Protos.MessageElements();
                                qw8.mergeFrom(messageElements3, blob3);
                                list3 = ou8.a(messageElements3.elements);
                            } else {
                                i3 = n27;
                                list3 = list5;
                            }
                            arrayList3.add(new nkc(string7, string8, string9, i6, (Set) I3, z5, z6, list3, o3.isNull(n35) ? null : Long.valueOf(o3.getLong(n35)), dy7.q(o3.isNull(n36) ? null : o3.getBlob(n36)), dy7.s(o3.isNull(n37) ? null : o3.getBlob(n37)), dy7.r(o3.isNull(n38) ? null : o3.getBlob(n38)), o3.getInt(n39) != 0));
                            n27 = i3;
                        }
                        o3.close();
                        xlc2.n();
                        return arrayList3;
                    } catch (Throwable th3) {
                        th = th3;
                        o3.close();
                        xlc2.n();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    xlc2 = xlc3;
                    o3.close();
                    xlc2.n();
                    throw th;
                }
            case 3:
                Cursor o4 = alc.a.o(xlc3, (CancellationSignal) null);
                try {
                    if (o4.moveToFirst()) {
                        if (!o4.isNull(0)) {
                            l = Long.valueOf(o4.getLong(0));
                            return l;
                        }
                    }
                    l = null;
                    return l;
                } finally {
                    o4.close();
                    xlc3.n();
                }
            default:
                Cursor o5 = alc.a.o(xlc3, (CancellationSignal) null);
                try {
                    return (!o5.moveToFirst() || o5.isNull(0)) ? null : o5.getBlob(0);
                } finally {
                    o5.close();
                    xlc3.n();
                }
        }
    }

    public void finalize() {
        switch (this.a) {
            case 0:
                this.b.n();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
