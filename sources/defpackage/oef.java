package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: oef  reason: default package */
public final class oef implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oef(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, mef] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object, nef] */
    /* JADX WARNING: type inference failed for: r0v20, types: [qpd, us] */
    /* JADX WARNING: type inference failed for: r10v2, types: [qpd, us] */
    public final Object call() {
        Cursor o;
        Throwable th;
        switch (this.a) {
            case 0:
                qef qef = (qef) this.b;
                ilc ilc = qef.a;
                ilc.c();
                try {
                    qef.b.C((nef) this.c);
                    ilc.r();
                    ilc.l();
                    return null;
                } catch (Throwable th2) {
                    ilc.l();
                    throw th2;
                }
            case 1:
                Object obj = null;
                Cursor o2 = ((qef) this.b).a.o((xlc) this.c, (CancellationSignal) null);
                try {
                    int n = tfg.n(o2, "finished");
                    int n2 = tfg.n(o2, "prepared_path");
                    int n3 = tfg.n(o2, "result_path");
                    int n4 = tfg.n(o2, "source_uri");
                    int n5 = tfg.n(o2, "quality");
                    int n6 = tfg.n(o2, "start_trim_position");
                    int n7 = tfg.n(o2, "end_trim_position");
                    int n8 = tfg.n(o2, "mute");
                    if (o2.moveToFirst()) {
                        ? obj2 = new Object();
                        if (o2.isNull(n4)) {
                            obj2.a = null;
                        } else {
                            obj2.a = o2.getString(n4);
                        }
                        obj2.b = mqb.values()[(o2.isNull(n5) ? null : Integer.valueOf(o2.getInt(n5))).intValue()];
                        obj2.c = o2.getFloat(n6);
                        obj2.d = o2.getFloat(n7);
                        boolean z = false;
                        obj2.e = o2.getInt(n8) != 0;
                        ? obj3 = new Object();
                        if (o2.getInt(n) != 0) {
                            z = true;
                        }
                        obj3.b = z;
                        if (o2.isNull(n2)) {
                            obj3.c = null;
                        } else {
                            obj3.c = o2.getString(n2);
                        }
                        if (o2.isNull(n3)) {
                            obj3.d = null;
                        } else {
                            obj3.d = o2.getString(n3);
                        }
                        obj3.a = obj2;
                        obj = obj3;
                    }
                    o2.close();
                    return obj;
                } catch (Throwable th3) {
                    o2.close();
                    throw th3;
                }
            default:
                i8g i8g = (i8g) this.b;
                ilc ilc2 = (ilc) i8g.a;
                ilc2.c();
                try {
                    o = ilc2.o((xlc) this.c, (CancellationSignal) null);
                    if (o instanceof AbstractWindowedCursor) {
                        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) o;
                        int count = abstractWindowedCursor.getCount();
                        if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                            try {
                                MatrixCursor matrixCursor = new MatrixCursor(o.getColumnNames(), o.getCount());
                                while (o.moveToNext()) {
                                    Object[] objArr = new Object[o.getColumnCount()];
                                    int columnCount = o.getColumnCount();
                                    for (int i = 0; i < columnCount; i++) {
                                        int type = o.getType(i);
                                        if (type == 0) {
                                            objArr[i] = null;
                                        } else if (type == 1) {
                                            objArr[i] = Long.valueOf(o.getLong(i));
                                        } else if (type == 2) {
                                            objArr[i] = Double.valueOf(o.getDouble(i));
                                        } else if (type == 3) {
                                            objArr[i] = o.getString(i);
                                        } else if (type == 4) {
                                            objArr[i] = o.getBlob(i);
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                v3c.i(o, (Throwable) null);
                                o = matrixCursor;
                            } catch (Throwable th4) {
                                Throwable th5 = th4;
                                v3c.i(o, th);
                                throw th5;
                            }
                        }
                    }
                    ? qpd = new qpd(0);
                    ? qpd2 = new qpd(0);
                    while (o.moveToNext()) {
                        String string = o.getString(0);
                        if (((ArrayList) qpd.get(string)) == null) {
                            qpd.put(string, new ArrayList());
                        }
                        String string2 = o.getString(0);
                        if (((ArrayList) qpd2.get(string2)) == null) {
                            qpd2.put(string2, new ArrayList());
                        }
                    }
                    o.moveToPosition(-1);
                    i8g.b(qpd);
                    i8g.a(qpd2);
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        String string3 = o.isNull(0) ? null : o.getString(0);
                        m7g v = nu0.v(o.getInt(1));
                        d24 a2 = d24.a(o.isNull(2) ? null : o.getBlob(2));
                        int i2 = o.getInt(3);
                        int i3 = o.getInt(4);
                        ArrayList arrayList2 = (ArrayList) qpd.get(o.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) qpd2.get(o.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new g8g(string3, v, a2, i2, i3, arrayList3, arrayList4));
                    }
                    ilc2.r();
                    o.close();
                    ilc2.l();
                    return arrayList;
                } catch (Throwable th6) {
                    ilc2.l();
                    throw th6;
                }
        }
    }

    public void finalize() {
        switch (this.a) {
            case 1:
                ((xlc) this.c).n();
                return;
            case 2:
                ((xlc) this.c).n();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
