package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.XmlResourceParser;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

/* renamed from: dle  reason: default package */
public abstract class dle implements CameraEnumerator {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ dle() {
        this.a = 10;
    }

    public static float J(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    public abstract IntentFilter A();

    public void B(RecyclerView recyclerView) {
        hdc hdc = (hdc) this.c;
        if (hdc != null || ((jdc) this.b) != null) {
            if (!(hdc == null || recyclerView.getAdapter() == ((hdc) this.c))) {
                String name = getClass().getName();
                hdc adapter = recyclerView.getAdapter();
                hm9.l0(name, "adapter was changed! cached adapter = " + ((hdc) this.c) + ", recyclerView.adapter = " + adapter, new IllegalStateException("adapter was changed"));
            }
            hdc hdc2 = (hdc) this.c;
            jdc jdc = (jdc) this.b;
            if (!(hdc2 == null || jdc == null)) {
                hdc2.B(jdc);
            }
            this.c = null;
            this.b = null;
        }
    }

    public Object C(Context context, XmlResourceParser xmlResourceParser) {
        Integer num = (Integer) s36.d(xmlResourceParser).get(((vg) this.b).a);
        return num != null ? z(context, xmlResourceParser, num.intValue()) : this.c;
    }

    public abstract int D();

    public abstract CameraCharacteristics E(String str);

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        for (String str : getDeviceNames()) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = H().getSupportedFormats(str);
            arrayList.add(isFrontFacing(str) ? new uw1(str, supportedFormats) : isBackFacing(str) ? new tw1(str, supportedFormats) : new vw1(str, supportedFormats));
        }
        return arrayList;
    }

    public Set G() {
        return Collections.emptySet();
    }

    public abstract CameraEnumerator H();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ww1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: ww1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ww1 I(int r3) {
        /*
            r2 = this;
            java.util.ArrayList r2 = r2.F()
            int[] r0 = defpackage.zh0.$EnumSwitchMapping$0
            int r3 = defpackage.au1.s(r3)
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x004e
            r0 = 2
            if (r3 == r0) goto L_0x0035
            r0 = 3
            if (r3 != r0) goto L_0x002f
            java.util.Iterator r2 = r2.iterator()
        L_0x001a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()
            r0 = r3
            ww1 r0 = (defpackage.ww1) r0
            boolean r0 = r0 instanceof defpackage.vw1
            if (r0 == 0) goto L_0x001a
            r1 = r3
        L_0x002c:
            ww1 r1 = (defpackage.ww1) r1
            goto L_0x0066
        L_0x002f:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0035:
            java.util.Iterator r2 = r2.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r2.next()
            r0 = r3
            ww1 r0 = (defpackage.ww1) r0
            boolean r0 = r0 instanceof defpackage.tw1
            if (r0 == 0) goto L_0x0039
            r1 = r3
        L_0x004b:
            ww1 r1 = (defpackage.ww1) r1
            goto L_0x0066
        L_0x004e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()
            r0 = r3
            ww1 r0 = (defpackage.ww1) r0
            boolean r0 = r0 instanceof defpackage.uw1
            if (r0 == 0) goto L_0x0052
            r1 = r3
        L_0x0064:
            ww1 r1 = (defpackage.ww1) r1
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dle.I(int):ww1");
    }

    public int K() {
        if (((je7) this.c).a()) {
            return Q().getMeasuredHeight();
        }
        return 0;
    }

    public int L() {
        if (((je7) this.c).a()) {
            return Q().getMeasuredWidth();
        }
        return 0;
    }

    public MenuItem M(MenuItem menuItem) {
        if (!(menuItem instanceof vde)) {
            return menuItem;
        }
        vde vde = (vde) menuItem;
        if (((qpd) this.c) == null) {
            this.c = new qpd();
        }
        MenuItem menuItem2 = (MenuItem) ((qpd) this.c).get(vde);
        if (menuItem2 != null) {
            return menuItem2;
        }
        fr8 fr8 = new fr8((Context) this.b, vde);
        ((qpd) this.c).put(vde, fr8);
        return fr8;
    }

    public short N() {
        return ((sla) this.c).a;
    }

    public int O() {
        return ((HashMap) this.b).hashCode();
    }

    public ele P() {
        return ele.c0;
    }

    public View Q() {
        return (View) ((je7) this.c).getValue();
    }

    public View R() {
        if (((je7) this.c).a()) {
            return Q();
        }
        return null;
    }

    public abstract void S();

    public void T(int i, int i2) {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            View view = (View) je7.getValue();
            ote.E(Q(), i, i2, 0, 12);
        }
    }

    public void U(int i, int i2) {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            ((View) je7.getValue()).measure(i, i2);
        }
    }

    public boolean V() {
        return !(this instanceof x70);
    }

    public abstract jdc W(RecyclerView recyclerView, hdc hdc);

    public abstract void X();

    public void Y(View view) {
    }

    public abstract void Z(String str, Executor executor, CameraDevice.StateCallback stateCallback);

    public abstract void a0(rj0 rj0);

    public abstract void b0(q6d q6d, yt1 yt1);

    public abstract void c0();

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper) {
        try {
            return H().createCapturer(str, cameraEventsHandler, captureFormatHelper);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((a4c) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public void d(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void d0() {
        y();
        IntentFilter A = A();
        if (A.countActions() != 0) {
            if (((an) this.b) == null) {
                this.b = new an(0, this);
            }
            ((dn) this.c).v0.registerReceiver((an) this.b, A);
        }
    }

    public void e(int i, String str) {
        ((HashMap) this.b).put(str, Integer.valueOf(i));
    }

    public abstract void e0();

    public abstract void f0();

    public void g(String str, List list) {
        ((HashMap) this.b).put(str, list);
    }

    public abstract void g0(CameraManager.AvailabilityCallback availabilityCallback);

    public String[] getDeviceNames() {
        return H().getDeviceNames();
    }

    public List getSupportedFormats(String str) {
        return H().getSupportedFormats(str);
    }

    public void h(String str, long[] jArr) {
        ((HashMap) this.b).put(str, jArr);
    }

    public void i(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public boolean isBackFacing(String str) {
        return H().isBackFacing(str);
    }

    public boolean isFrontFacing(String str) {
        return H().isFrontFacing(str);
    }

    public void n(String str, Map map) {
        ((HashMap) this.b).put(str, map);
    }

    public void p(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public void t() {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ay7.a(viewGroup, Q(), new ViewGroup.LayoutParams(-2, -2));
        Q().setVisibility(0);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return s5c.T((HashMap) this.b);
            default:
                return super.toString();
        }
    }

    public void v(RecyclerView recyclerView) {
        B(recyclerView);
        hdc adapter = recyclerView.getAdapter();
        if (adapter != null) {
            this.c = adapter;
            jdc W = W(recyclerView, adapter);
            this.b = W;
            adapter.z(W);
            return;
        }
        throw new IllegalArgumentException("require not null adapter".toString());
    }

    public boolean w() {
        return this instanceof rf9;
    }

    public abstract void x();

    public void y() {
        an anVar = (an) this.b;
        if (anVar != null) {
            try {
                ((dn) this.c).v0.unregisterReceiver(anVar);
            } catch (IllegalArgumentException unused) {
            }
            this.b = null;
        }
    }

    public abstract Object z(Context context, XmlResourceParser xmlResourceParser, int i);

    public /* synthetic */ dle(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public dle(a4c a4c) {
        this.a = 4;
        this.b = a4c;
        this.c = getClass().getSimpleName();
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        try {
            return H().createCapturer(str, cameraEventsHandler);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((a4c) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public dle(m56 m56) {
        this.a = 6;
        this.c = tu0.r(3, new x2((Object) m56, 5, (Object) this));
    }

    public dle(sla sla) {
        this.a = 0;
        this.b = new HashMap();
        this.c = sla;
    }

    public dle(Context context) {
        this.a = 5;
        this.b = context;
    }

    public dle(int i) {
        this.a = 9;
        this.c = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.c).add(new Object());
        }
    }

    public dle(CameraDevice cameraDevice, tfg tfg) {
        this.a = 7;
        cameraDevice.getClass();
        this.b = cameraDevice;
        this.c = tfg;
    }

    public dle(Context context, z7 z7Var) {
        this.a = 8;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = z7Var;
    }

    public dle(dn dnVar) {
        this.a = 2;
        this.c = dnVar;
    }
}
