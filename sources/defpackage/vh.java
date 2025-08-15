package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: vh  reason: default package */
public final class vh implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ wh c;

    public /* synthetic */ vh(wh whVar, xlc xlc, int i) {
        this.a = i;
        this.c = whVar;
        this.b = xlc;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                ilc ilc = this.c.a;
                xlc xlc = this.b;
                Cursor o = ilc.o(xlc, (CancellationSignal) null);
                try {
                    int n = tfg.n(o, "id");
                    int n2 = tfg.n(o, "update_time");
                    int n3 = tfg.n(o, "emoji");
                    int n4 = tfg.n(o, "lottie_url");
                    int n5 = tfg.n(o, "lottie_play_url");
                    int n6 = tfg.n(o, "set_id");
                    int n7 = tfg.n(o, "icon_url");
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList.add(new ii(o.getLong(n), o.getLong(n2), o.isNull(n3) ? null : o.getString(n3), o.isNull(n4) ? null : o.getString(n4), o.isNull(n5) ? null : o.getString(n5), o.isNull(n6) ? null : Long.valueOf(o.getLong(n6)), o.isNull(n7) ? null : o.getString(n7)));
                    }
                    return arrayList;
                } finally {
                    o.close();
                    xlc.n();
                }
            case 1:
                ilc ilc2 = this.c.a;
                xlc xlc2 = this.b;
                Cursor o2 = ilc2.o(xlc2, (CancellationSignal) null);
                try {
                    int n8 = tfg.n(o2, "id");
                    int n9 = tfg.n(o2, "update_time");
                    int n10 = tfg.n(o2, "emoji");
                    int n11 = tfg.n(o2, "lottie_url");
                    int n12 = tfg.n(o2, "lottie_play_url");
                    int n13 = tfg.n(o2, "set_id");
                    int n14 = tfg.n(o2, "icon_url");
                    ArrayList arrayList2 = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList2.add(new ii(o2.getLong(n8), o2.getLong(n9), o2.isNull(n10) ? null : o2.getString(n10), o2.isNull(n11) ? null : o2.getString(n11), o2.isNull(n12) ? null : o2.getString(n12), o2.isNull(n13) ? null : Long.valueOf(o2.getLong(n13)), o2.isNull(n14) ? null : o2.getString(n14)));
                    }
                    return arrayList2;
                } finally {
                    o2.close();
                    xlc2.n();
                }
            default:
                ilc ilc3 = this.c.a;
                xlc xlc3 = this.b;
                Integer num = null;
                Cursor o3 = ilc3.o(xlc3, (CancellationSignal) null);
                try {
                    if (o3.moveToFirst()) {
                        if (!o3.isNull(0)) {
                            num = Integer.valueOf(o3.getInt(0));
                        }
                    }
                    return num;
                } finally {
                    o3.close();
                    xlc3.n();
                }
        }
    }
}
