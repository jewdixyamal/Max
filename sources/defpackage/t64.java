package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: t64  reason: default package */
public final /* synthetic */ class t64 implements jm7, km7, ve4, qj3 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ t64(ed edVar, xn7 xn7, pc8 pc8, IOException iOException, boolean z) {
        this.o = xn7;
        this.X = pc8;
        this.b = iOException;
        this.c = z;
    }

    public void accept(Object obj) {
        te0 te0 = (te0) obj;
        ((jc6) this.o).getClass();
        qv4 qv4 = (qv4) this.X;
        uv4 uv4 = qv4.a;
        ArrayList arrayList = uv4.a;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                if (((nv4) listIterator.next()) instanceof te0) {
                    listIterator.set(te0);
                    uv4.invalidate();
                    break;
                }
            } else {
                arrayList.add(0, te0);
                uv4.invalidate();
                break;
            }
        }
        qv4.b();
        if (this.c) {
            qv4.a.post(new f5((Object) qv4, (Object) (ov4) this.b, (Object) te0, 25));
        }
    }

    public void invoke(Object obj) {
        Object obj2 = this.X;
        Object obj3 = this.o;
        boolean z = this.c;
        Object obj4 = this.b;
        switch (this.a) {
            case 0:
                ((u65) obj).getClass();
                StringBuilder sb = new StringBuilder("MediaLoadData{dataType=");
                pc8 pc8 = (pc8) obj2;
                sb.append(pc8.a);
                sb.append(", trackType=");
                sb.append(pc8.b);
                sb.append(", trackFormat=");
                sb.append((oy5) pc8.g);
                sb.append(", trackSelectionReason=");
                sb.append(pc8.c);
                sb.append(", trackSelectionData=");
                sb.append(pc8.d);
                sb.append(", mediaStartTimeMs=");
                sb.append(pc8.e);
                sb.append(", mediaEndTimeMs=");
                String k = zr6.k(sb, pc8.f, "}");
                StringBuilder sb2 = new StringBuilder("LoadEventInfo{loadTaskId");
                xn7 xn7 = (xn7) obj3;
                sb2.append(xn7.a);
                sb2.append(", dataSpec");
                sb2.append(xn7.b);
                sb2.append(", uri");
                sb2.append(xn7.c);
                sb2.append(", responseHeaders");
                sb2.append(xn7.d);
                sb2.append(", elapsedRealtimeMs");
                sb2.append(xn7.e);
                sb2.append(", loadDurationMs");
                sb2.append(xn7.f);
                sb2.append(", bytesLoaded");
                IOException iOException = (IOException) obj4;
                hm9.r("u65", iOException, "onLoadError, wasCanceled %b, loadEventInfo = %s, mediaLoadData = %s", Boolean.valueOf(z), zr6.k(sb2, xn7.g, "}"), k);
                return;
            default:
                ((gd) obj).R((fd) obj3, (pc8) obj2, (IOException) obj4, z);
                return;
        }
    }

    public ffc k(int i, rze rze, int[] iArr) {
        cf4 cf4 = (cf4) this.o;
        cf4.getClass();
        ge4 ge4 = new ge4(0, cf4);
        int i2 = ((int[]) this.b)[i];
        ww6 i3 = zw6.i();
        rze rze2 = rze;
        for (int i4 = 0; i4 < rze2.a; i4++) {
            i3.a(new ie4(i, rze, i4, (oe4) this.X, iArr[i4], this.c, ge4, i2));
        }
        return i3.j();
    }

    public /* synthetic */ t64(fd fdVar, yn7 yn7, pc8 pc8, IOException iOException, boolean z) {
        this.o = fdVar;
        this.X = pc8;
        this.b = iOException;
        this.c = z;
    }

    public /* synthetic */ t64(cf4 cf4, oe4 oe4, boolean z, int[] iArr) {
        this.o = cf4;
        this.X = oe4;
        this.c = z;
        this.b = iArr;
    }

    public /* synthetic */ t64(jc6 jc6, qv4 qv4, ov4 ov4, boolean z) {
        this.o = jc6;
        this.X = qv4;
        this.b = ov4;
        this.c = z;
    }
}
