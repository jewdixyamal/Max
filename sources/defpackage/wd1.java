package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: wd1  reason: default package */
public final class wd1 extends ppd {
    public final i1b X;
    public final km1 Y;
    public final g71 Z;
    public final xl1 s0;
    public final fm1 t0;
    public final Executor u0;
    public final en1 v0;
    public final ugf w0;
    public final b x0;
    public final je7 y0;
    public final je7 z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wd1(defpackage.i1b r2, defpackage.ui1 r3, defpackage.ki1 r4, defpackage.ti1 r5, defpackage.fm1 r6, defpackage.je7 r7, defpackage.je7 r8, defpackage.en1 r9, defpackage.ugf r10, androidx.recyclerview.widget.b r11) {
        /*
            r1 = this;
            jyc r0 = defpackage.jyc.a
            iba r0 = r0.p()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1.<init>(r0)
            r1.X = r2
            r1.Y = r3
            r1.Z = r4
            r1.s0 = r5
            r1.t0 = r6
            r1.u0 = r0
            r1.v0 = r9
            r1.w0 = r10
            r1.x0 = r11
            r1.y0 = r7
            r1.z0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd1.<init>(i1b, ui1, ki1, ti1, fm1, je7, je7, en1, ugf, androidx.recyclerview.widget.b):void");
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        hqd.A((vd1) ((ol7) C(i)));
    }

    /* renamed from: I */
    public final void y(hqd hqd) {
        hqd.D();
        om1 om1 = hqd instanceof om1 ? (om1) hqd : null;
        if (om1 != null) {
            om1.F0.a.remove(om1);
        }
    }

    public final void s(dec dec, int i, List list) {
        u2 u2Var;
        hqd hqd = (hqd) dec;
        if (!list.isEmpty()) {
            vd1 vd1 = (vd1) ((ol7) C(i));
            if (vd1 instanceof ud1) {
                u2Var = new u2(7);
                for (Object next : list) {
                    td1 td1 = next instanceof td1 ? (td1) next : null;
                    if (td1 != null) {
                        u2Var.M1(td1);
                    }
                }
            } else if (vd1 instanceof qd1) {
                u2Var = new u2(7);
                for (Object next2 : list) {
                    pd1 pd1 = next2 instanceof pd1 ? (pd1) next2 : null;
                    if (pd1 != null) {
                        u2Var.M1(pd1);
                    }
                }
            } else if (vd1 instanceof sd1) {
                u2Var = new u2(7);
                for (Object next3 : list) {
                    rd1 rd1 = next3 instanceof rd1 ? (rd1) next3 : null;
                    if (rd1 != null) {
                        u2Var.M1(rd1);
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            hqd.B(vd1, u2Var);
            return;
        }
        r(hqd, i);
    }

    public final dec t(ViewGroup viewGroup, int i) {
        je7 je7 = this.y0;
        je7 je72 = this.z0;
        b bVar = this.x0;
        ugf ugf = this.w0;
        if (i == 111) {
            mm1 mm1 = new mm1(viewGroup.getContext(), (AttributeSet) null);
            mm1.setLayoutParams(new ti3(-1, -1));
            mm1.setVisibility(0);
            mm1.setOnTouchListener((View.OnTouchListener) je7.getValue());
            mm1.setControlsMediator((uv3) je72.getValue());
            mm1.setVideoLayoutUpdatesController(ugf);
            mm1.setCallSpeakerMediator(this.t0);
            mm1.setListener(this.Y);
            mm1.setOpponentsViewPool(bVar);
            ((uv3) je72.getValue()).b(mm1);
            this.X.a.add(mm1);
            return new om1(mm1, this.v0);
        } else if (i == 222) {
            h71 h71 = new h71(viewGroup.getContext(), (AttributeSet) null);
            h71.setLayoutParams(new ti3(-1, -1));
            h71.setVisibility(0);
            h71.setOnTouchListener((View.OnTouchListener) je7.getValue());
            h71.setControlsMediator((uv3) je72.getValue());
            h71.setListener(this.Z);
            h71.setVideoLayoutUpdatesController(ugf);
            h71.setOpponentsViewPool(bVar);
            ((uv3) je72.getValue()).b(h71);
            return new az0(h71, 2);
        } else if (i == 225) {
            yl1 yl1 = new yl1(viewGroup.getContext(), (AttributeSet) null);
            yl1.setLayoutParams(new ti3(-1, -1));
            yl1.setVisibility(0);
            yl1.setListener(this.s0);
            return new az0(yl1, 5);
        } else {
            throw new IllegalStateException(("unknown item view type " + i).toString());
        }
    }
}
