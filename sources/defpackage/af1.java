package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: af1  reason: default package */
public final class af1 extends ppd {
    public final nnf X;
    public final Executor Y;
    public final ye1 Z;
    public final k56 s0;
    public final k56 t0;
    public final k56 u0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public af1(defpackage.nnf r4, defpackage.ye1 r5, defpackage.k56 r6, defpackage.hm1 r7, defpackage.i71 r8, int r9) {
        /*
            r3 = this;
            jyc r0 = defpackage.jyc.a
            iba r0 = r0.p()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1 = r9 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0010
            r7 = r2
        L_0x0010:
            r9 = r9 & 32
            if (r9 == 0) goto L_0x0015
            r8 = r2
        L_0x0015:
            r3.<init>(r0)
            r3.X = r4
            r3.Y = r0
            r3.Z = r5
            r3.s0 = r6
            r3.t0 = r7
            r3.u0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af1.<init>(nnf, ye1, k56, hm1, i71, int):void");
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        s(hqd, i, nz4.a);
    }

    /* renamed from: J */
    public final void s(hqd hqd, int i, List list) {
        k56 k56;
        if ((hqd instanceof xe1 ? (xe1) hqd : null) != null) {
            if (this.X != nnf.c) {
                ((xe1) hqd).G0.setMode(yo1.b);
            } else if (j() == 1 && (k56 = this.u0) != null && ((Number) k56.invoke()).intValue() == 0) {
                ((xe1) hqd).G0.setMode(yo1.X);
            } else {
                ((xe1) hqd).G0.setMode(yo1.a);
            }
        }
        int K = K();
        View view = hqd.a;
        if (!(view.getWidth() == K && view.getHeight() == K)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = K;
                layoutParams.height = K;
                view.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        iv ivVar = this.o;
        if (((kb1) ivVar.f.get(i)).l() != 1) {
            hqd.A((ol7) ivVar.f.get(i));
        } else if (list.isEmpty()) {
            hqd.A((ol7) ivVar.f.get(i));
        } else {
            xe1 xe1 = (xe1) hqd;
            pk5 pk5 = new pk5(l6d.Z(new um5(new at(2, list), new we1(0), n6d.a), n71.o));
            while (pk5.hasNext()) {
                gb1 gb1 = (gb1) pk5.next();
                boolean z = gb1 instanceof cb1;
                ap1 ap1 = xe1.G0;
                if (z) {
                    cb1 cb1 = (cb1) gb1;
                    ap1.J(cb1.b, cb1.a);
                } else if (gb1 instanceof db1) {
                    ap1.setRaiseHand(((db1) gb1).a);
                } else if (gb1 instanceof bb1) {
                    ap1.F(((bb1) gb1).a);
                } else if (gb1 instanceof eb1) {
                    ap1.G(((eb1) gb1).a);
                } else if (gb1 instanceof za1) {
                    ap1.setAvatar(((za1) gb1).a);
                } else if (gb1 instanceof ab1) {
                    ap1.setButtonAction(((ab1) gb1).a);
                } else if (gb1 instanceof fb1) {
                    ap1.setOpponentVideo(((fb1) gb1).a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final int K() {
        int ordinal = this.X.ordinal();
        if (ordinal == 0) {
            return tu0.G(((float) 96) * fk4.d().getDisplayMetrics().density);
        }
        if (ordinal == 1) {
            return tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density);
        }
        if (ordinal == 2) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int l(int i) {
        return ((kb1) this.o.f.get(i)).l();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, vl1, android.view.ViewGroup] */
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = i;
        int K = K();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(K, K));
        ye1 ye1 = this.Z;
        if (i2 == 3) {
            Context context = viewGroup.getContext();
            ? constraintLayout = new ConstraintLayout(context, (AttributeSet) null);
            pq9 pq9 = qp4.u0;
            constraintLayout.setBackgroundColor(pq9.p(constraintLayout).c.b().g);
            dy7.H(constraintLayout, fk4.d().getDisplayMetrics().density * 20.0f);
            AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
            appCompatTextView.setId(y7a.Y);
            appCompatTextView.setLayoutParams(new ti3(-1, -2));
            appCompatTextView.setGravity(17);
            i4f.b.b(appCompatTextView, du4.b);
            appCompatTextView.setTextColor(pq9.p(appCompatTextView).c.getText().e);
            appCompatTextView.setText(f0c.call_item_join_by_link_preview_title);
            knc knc = new knc(context, (AttributeSet) null);
            knc.setId(y7a.U);
            int i3 = x7a.E;
            pq9.p(knc).c.getClass();
            knc.y(i3, -1);
            knc.setAccessibility(Integer.valueOf(b8a.F));
            knc.setMode(fnc.X);
            float f = (float) 32;
            knc.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
            knc.setButtonPadding(tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density));
            tu0.K(knc, 300, new tl1(constraintLayout, 0));
            knc knc2 = new knc(context, (AttributeSet) null);
            knc2.setId(y7a.V);
            fnc fnc = fnc.a;
            knc2.setMode(fnc);
            float f2 = (float) 56;
            knc2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
            float f3 = (float) 6;
            knc2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
            knc.B(knc2, x7a.H);
            int i4 = b8a.T;
            knc2.setTitle(new eqe(i4));
            knc2.setAccessibility(Integer.valueOf(i4));
            tu0.K(knc2, 300, new tl1(constraintLayout, 1));
            knc knc3 = new knc(context, (AttributeSet) null);
            knc3.setId(y7a.X);
            knc3.setMode(fnc);
            knc3.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
            knc3.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
            knc.B(knc3, x7a.q0);
            int i5 = b8a.V;
            knc3.setTitle(new eqe(i5));
            knc3.setAccessibility(Integer.valueOf(i5));
            tu0.K(knc3, 300, new tl1(constraintLayout, 2));
            knc knc4 = new knc(context, (AttributeSet) null);
            knc4.setId(y7a.W);
            knc4.setMode(fnc);
            knc4.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
            knc4.setButtonPadding(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
            knc.B(knc4, x7a.o0);
            int i6 = b8a.U;
            knc4.setTitle(new eqe(i6));
            knc4.setAccessibility(Integer.valueOf(i6));
            tu0.K(knc4, 300, new tl1(constraintLayout, 3));
            constraintLayout.addView(appCompatTextView);
            constraintLayout.addView(knc);
            constraintLayout.addView(knc2);
            constraintLayout.addView(knc3);
            constraintLayout.addView(knc4);
            dj3 q = fp3.q(constraintLayout);
            int id = knc.getId();
            q.d(id, 3, 0, 3);
            float f4 = (float) 12;
            au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
            q.d(id, 7, 0, 7);
            new l2a(q, 7, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
            int id2 = appCompatTextView.getId();
            q.d(id2, 3, knc.getId(), 4);
            q.d(id2, 7, 0, 7);
            au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id2, 4));
            q.d(id2, 6, 0, 6);
            new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
            int id3 = knc2.getId();
            q.d(id3, 3, appCompatTextView.getId(), 4);
            au1.p((float) 4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
            q.d(id3, 6, 0, 6);
            new l2a(q, 6, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
            q.d(id3, 7, knc4.getId(), 6);
            q.d(id3, 4, 0, 4);
            new l2a(q, 4, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
            int id4 = knc4.getId();
            q.d(id4, 3, knc2.getId(), 3);
            q.d(id4, 6, knc2.getId(), 7);
            q.d(id4, 7, knc3.getId(), 6);
            q.d(id4, 4, knc2.getId(), 4);
            int id5 = knc3.getId();
            q.d(id5, 3, knc4.getId(), 3);
            q.d(id5, 6, knc4.getId(), 7);
            q.d(id5, 7, 0, 7);
            new l2a(q, 7, id5, 4).e(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
            q.d(id5, 4, knc4.getId(), 4);
            q.a(constraintLayout);
            constraintLayout.setId(rvb.call_copy_link_preview);
            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(constraintLayout);
            return new ze1(frameLayout, (ul1) ye1);
        } else if (i2 != 4) {
            ap1 ap1 = new ap1(viewGroup.getContext(), (AttributeSet) null);
            ap1.setId(rvb.call_opponent);
            int ordinal = this.X.ordinal();
            yo1 yo1 = yo1.b;
            if (!(ordinal == 0 || ordinal == 1)) {
                if (ordinal == 2) {
                    yo1 = yo1.a;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            ap1.setMode(yo1);
            ap1.setCustomTheme(qp4.u0.p(ap1).c);
            ap1.setCallSpeakerMediator(this.t0);
            ap1.setVideoLayoutUpdatesControllerProvider(this.s0);
            frameLayout.addView(ap1, -1, -1);
            return new xe1(frameLayout, ye1);
        } else {
            aq1 aq1 = new aq1(viewGroup.getContext());
            aq1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(aq1);
            return new az0(frameLayout, 4);
        }
    }
}
