package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.webrtc.VideoEncoderObserver;

/* renamed from: ar0  reason: default package */
public class ar0 implements ej5, a76, fd6, ed6, v15, VideoEncoderObserver, nr8 {
    public boolean a;
    public Object b;

    public /* synthetic */ ar0(Object obj) {
        this.b = obj;
    }

    public synchronized void B(hd6 hd6, long j) {
        if (this.a) {
            ((jo7) this.b).B(hd6, j);
        }
    }

    public void a(Object obj) {
        List list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        if (this.a) {
            arrayList.removeAll(Collections.singleton((Object) null));
        }
        ((lq1) this.b).b(arrayList);
    }

    public void b(sq4 sq4) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        od2.m(size, arrayList.size() + 1);
        arrayList.add(size, sq4);
        if (this.a) {
            sq4.g();
        }
    }

    public void c(wq8 wq8, boolean z) {
        e7 e7Var;
        if (!this.a) {
            this.a = true;
            mwe mwe = (mwe) this.b;
            ActionMenuView actionMenuView = mwe.o.a.a;
            if (!(actionMenuView == null || (e7Var = actionMenuView.s0) == null)) {
                e7Var.f();
                b7 b7Var = e7Var.E0;
                if (b7Var != null && b7Var.b()) {
                    b7Var.j.dismiss();
                }
            }
            mwe.X.onPanelClosed(108, wq8);
            this.a = false;
        }
    }

    public void d(Throwable th) {
        boolean z = th instanceof TimeoutException;
        lq1 lq1 = (lq1) this.b;
        if (z) {
            lq1.d(th);
        } else {
            lq1.b(Collections.emptyList());
        }
    }

    public void e() {
        if (!this.a) {
            this.a = true;
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new dmd(i));
            }
            ((y51) this.b).E(arrayList);
        }
    }

    public void f(File file) {
        o94 o94;
        m94 g;
        if (this.a && (g = o94.g(o94, file)) != null) {
            String str = g.b;
            if (str == ".tmp") {
                long lastModified = file.lastModified();
                (o94 = (o94) this.b).e.getClass();
                if (lastModified > System.currentTimeMillis() - o94.f) {
                    return;
                }
            } else {
                od2.p(str == ".cnt");
                return;
            }
        }
        file.delete();
    }

    public void g() {
        if (this.a) {
            this.a = false;
            ((y51) this.b).E(nz4.a);
        }
    }

    public void h() {
        if (this.a) {
            ((jo7) this.b).h();
        }
    }

    public sq4 i(int i) {
        return (sq4) ((ArrayList) this.b).get(i);
    }

    public void j(File file) {
        if (!this.a && file.equals(((o94) this.b).c)) {
            this.a = true;
        }
    }

    public void k() {
        this.a = true;
    }

    public void l() {
        this.a = false;
    }

    public void m(File file) {
        o94 o94 = (o94) this.b;
        if (!o94.a.equals(file) && !this.a) {
            file.delete();
        }
        if (this.a && file.equals(o94.c)) {
            this.a = false;
        }
    }

    public void n() {
        this.a = false;
    }

    public boolean o(wq8 wq8) {
        ((mwe) this.b).X.onMenuOpened(108, wq8);
        return true;
    }

    public void onEncoderChanged(VideoEncoderObserver.EncoderInfo encoderInfo) {
        nsa nsa = (nsa) this.b;
        a4c a4c = nsa.K0;
        StringBuilder sb = new StringBuilder("Encoder for ");
        boolean z = this.a;
        sb.append(z ? "camera" : "screen share");
        sb.append(" updated: ");
        sb.append(encoderInfo.getEncoderType());
        sb.append(", ");
        sb.append(encoderInfo.getImplementationName());
        sb.append(", isHw: ");
        sb.append(encoderInfo.isHardwareAccelerated());
        a4c.log("PCRTCClient", sb.toString());
        if (z) {
            nsa.i("onCameraEncoderInfoChanged", new adg(nsa, new gsa(this, 5, encoderInfo), 1));
        }
    }

    public void p() {
        if (!this.a) {
            this.a = true;
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) this.b;
                if (i < arrayList.size()) {
                    ((sq4) arrayList.get(i)).g();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public synchronized void q() {
        if (this.a) {
            ((jo7) this.b).q();
        }
    }

    public void r() {
        if (this.a) {
            int i = 0;
            this.a = false;
            while (true) {
                ArrayList arrayList = (ArrayList) this.b;
                if (i < arrayList.size()) {
                    ((sq4) arrayList.get(i)).h();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void release() {
        a4c a4c = ((nsa) this.b).K0;
        a4c.log("PCRTCClient", "Encoder observer released isCamera=(" + this.a + ")");
    }

    public void s(hd6 hd6) {
        if (this.a) {
            ((jo7) this.b).s(hd6);
        }
    }

    public void t(char c) {
        sh0 sh0 = (sh0) this.b;
        sh0.r(sh0.b, 1);
        int i = sh0.b;
        sh0.b = i + 1;
        ((char[]) sh0.c)[i] = c;
    }

    public void u(String str) {
        ((sh0) this.b).J(str);
    }

    public synchronized void v() {
        if (this.a) {
            ((jo7) this.b).v();
        }
    }

    public void w(String str) {
        int i;
        int i2;
        sh0 sh0 = (sh0) this.b;
        sh0.getClass();
        sh0.r(sh0.b, str.length() + 2);
        char[] cArr = (char[]) sh0.c;
        int i3 = sh0.b;
        int i4 = i3 + 1;
        cArr[i3] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i4);
        int i5 = length + i4;
        int i6 = i4;
        while (i < i5) {
            char c = cArr[i];
            byte[] bArr = r9e.b;
            if (c >= bArr.length || bArr[c] == 0) {
                i6 = i + 1;
            } else {
                int length2 = str.length();
                for (int i7 = i - i4; i7 < length2; i7++) {
                    sh0.r(i, 2);
                    char charAt = str.charAt(i7);
                    byte[] bArr2 = r9e.b;
                    if (charAt < bArr2.length) {
                        byte b2 = bArr2[charAt];
                        if (b2 == 0) {
                            i2 = i + 1;
                            ((char[]) sh0.c)[i] = (char) charAt;
                        } else {
                            if (b2 == 1) {
                                String str2 = r9e.a[charAt];
                                sh0.r(i, str2.length());
                                str2.getChars(0, str2.length(), (char[]) sh0.c, i);
                                int length3 = str2.length() + i;
                                sh0.b = length3;
                                i = length3;
                            } else {
                                char[] cArr2 = (char[]) sh0.c;
                                cArr2[i] = '\\';
                                cArr2[i + 1] = (char) b2;
                                i += 2;
                                sh0.b = i;
                            }
                        }
                    } else {
                        i2 = i + 1;
                        ((char[]) sh0.c)[i] = (char) charAt;
                    }
                    i = i2;
                }
                sh0.r(i, 1);
                ((char[]) sh0.c)[i] = '\"';
                sh0.b = i + 1;
                return;
            }
        }
        cArr[i5] = '\"';
        sh0.b = i5 + 1;
    }

    public void x() {
    }

    public void y() {
    }

    public /* synthetic */ ar0(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public ar0(boolean z, r38 r38) {
        this.a = z;
        this.b = r38;
    }

    public ar0(sh0 sh0) {
        this.b = sh0;
        this.a = true;
    }

    public ar0() {
        this.a = false;
        this.b = new ArrayList();
    }
}
