package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* renamed from: qv4  reason: default package */
public final class qv4 implements tv4 {
    public final uv4 a;
    public zva b;
    public imc c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f = -65536;
    public float g = 24.0f;
    public boolean h = false;

    public qv4(uv4 uv4) {
        this.a = uv4;
        uv4.setListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r5 = (java.lang.Integer) r4.get(r5.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ov4 a() {
        /*
            r11 = this;
            uv4 r0 = r11.a
            java.util.List r1 = r0.getLayers()
            java.util.ArrayList r11 = r11.d
            android.graphics.Rect r2 = r0.getBounds()
            boolean r0 = r0.y0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 1
        L_0x001d:
            boolean r6 = r1.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = r1.next()
            nv4 r6 = (defpackage.nv4) r6
            boolean r8 = r6 instanceof defpackage.xq4
            if (r8 == 0) goto L_0x0045
            r7 = r6
            xq4 r7 = (defpackage.xq4) r7
            android.graphics.Paint r8 = r7.c
            int r8 = r8.getColor()
            android.graphics.Paint r9 = r7.c
            float r9 = r9.getStrokeWidth()
            java.util.ArrayList r7 = r7.a
            ee7 r10 = new ee7
            r10.<init>(r5, r8, r9, r7)
            r7 = r10
        L_0x0045:
            if (r7 == 0) goto L_0x001d
            r3.add(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.put(r6, r7)
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0054:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x005d:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r11.next()
            s9 r5 = (defpackage.s9) r5
            boolean r6 = r5 instanceof defpackage.s9
            if (r6 == 0) goto L_0x0081
            nv4 r5 = r5.a
            java.lang.Object r5 = r4.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0081
            int r5 = r5.intValue()
            e73 r6 = new e73
            r6.<init>((int) r5)
            goto L_0x0082
        L_0x0081:
            r6 = r7
        L_0x0082:
            if (r6 == 0) goto L_0x005d
            r1.add(r6)
            goto L_0x005d
        L_0x0088:
            ov4 r11 = new ov4
            r11.<init>(r3, r1, r2, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv4.a():ov4");
    }

    public final void b() {
        zva zva = this.b;
        if (zva != null) {
            boolean z = !this.e.isEmpty();
            ArrayList arrayList = this.d;
            boolean z2 = this.h;
            cwa cwa = zva.e;
            cwa.getClass();
            cwa cwa2 = new cwa(z, !arrayList.isEmpty(), !arrayList.isEmpty(), cwa.o, cwa.X, z2, cwa.Z);
            zva.e = cwa2;
            zva.a.a(cwa2);
        }
    }

    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        uv4 uv4 = this.a;
        if (action == 0) {
            motionEvent.getX();
            motionEvent.getY();
            List<nv4> layers = uv4.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                nv4 nv4 = layers.get(size);
            }
            xq4 xq4 = new xq4(this.f, this.g);
            imc imc = new imc(xq4);
            this.c = imc;
            ((ArrayList) imc.c).add(new zq4(motionEvent.getX(), motionEvent.getY()));
            uv4.a.add(xq4);
            uv4.invalidate();
            zva zva = this.b;
            if (zva != null) {
                ((BrushWidthViewImpl) zva.a.t0).setVisibility(8);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            imc imc2 = this.c;
            if (imc2 != null) {
                imc2.W(motionEvent);
            }
            imc imc3 = this.c;
            if (imc3 != null) {
                s9 O = imc3.O();
                this.e.clear();
                this.d.add(O);
            }
            this.c = null;
            this.h = true;
            b();
        } else {
            imc imc4 = this.c;
            if (imc4 != null) {
                imc4.W(motionEvent);
            }
        }
        uv4.invalidate();
    }
}
