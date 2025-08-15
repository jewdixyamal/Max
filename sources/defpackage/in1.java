package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: in1  reason: default package */
public final class in1 extends ConstraintLayout {
    public final khe G0 = new khe(new dk1(10));
    public final knc H0;
    public final knc I0;
    public final AppCompatTextView J0;
    public final AppCompatTextView K0;
    public ln1 L0;
    public nnf M0;
    public Integer N0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public in1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        setLayoutParams(new ti3(-1, -2));
        knc knc = new knc(context2, (AttributeSet) null);
        knc.setId(rvb.call_collapsing);
        knc.B(knc, ztb.ic_chevron_down_24);
        knc.setAccessibility(Integer.valueOf(f0c.call_collapsing_accessibility));
        fnc fnc = fnc.a;
        knc.setMode(fnc);
        knc.setListener(new gn1(this, 0));
        float f = (float) 40;
        knc.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        float f2 = (float) 3;
        knc.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        knc.setLayoutParams(new ti3(-2, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(rvb.call_name);
        appCompatTextView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setMaxLines(1);
        kqe kqe = i4f.o;
        kqe.b(appCompatTextView, du4.b);
        pq9 pq9 = qp4.u0;
        pq9.p(appCompatTextView).c.getClass();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setVisibility(8);
        this.J0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(rvb.call_status);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        kqe.b(appCompatTextView2, du4.b);
        pq9.p(appCompatTextView2).c.getClass();
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setVisibility(8);
        this.K0 = appCompatTextView2;
        knc knc2 = new knc(context2, (AttributeSet) null);
        knc2.setId(rvb.call_mode);
        knc.B(knc2, ztb.ic_call_mode_default_18);
        knc2.setMode(fnc);
        float f3 = (float) 4;
        knc2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        knc2.setAccessibility(Integer.valueOf(f0c.call_video_mode_accessibility));
        knc2.setListener(new gn1(this, 1));
        knc2.setVisibility(4);
        knc2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        knc2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        knc2.setLayoutParams(new ti3(-2, -2));
        this.I0 = knc2;
        knc knc3 = new knc(context2, (AttributeSet) null);
        knc3.setId(rvb.call_add_member);
        knc.B(knc3, ztb.ic_add_user_18);
        knc3.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        knc3.setAccessibility(Integer.valueOf(f0c.call_member_add_accessibility));
        pq9.p(knc3).c.getClass();
        knc3.setTextColor(-1);
        knc3.setMode(fnc);
        knc3.setListener(new gn1(this, 2));
        knc3.setMinWidth(tu0.G(fk4.d().getDisplayMetrics().density * f));
        knc3.setShape(enc.b);
        knc3.setVisibility(4);
        knc3.setButtonPadding(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        knc3.setImageSize(new gnc(-2, tu0.G(fk4.d().getDisplayMetrics().density * f)));
        knc3.setLayoutParams(new ti3(-2, -2));
        this.H0 = knc3;
        addView(knc);
        addView(appCompatTextView, 0, -2);
        addView(appCompatTextView2, -2, -2);
        addView(knc2);
        addView(knc3);
        dj3 q = fp3.q(this);
        int id = knc.getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        int id2 = appCompatTextView.getId();
        q.d(id2, 7, knc2.getId(), 6);
        new l2a(q, 7, id2, 4).e(tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
        q.d(id2, 6, knc.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id2, 4));
        q.d(id2, 3, 0, 3);
        q.g(id2).d.l0 = true;
        int id3 = appCompatTextView2.getId();
        q.d(id3, 7, appCompatTextView.getId(), 7);
        q.d(id3, 6, appCompatTextView.getId(), 6);
        q.d(id3, 3, appCompatTextView.getId(), 4);
        new l2a(q, 3, id3, 4).e(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
        int id4 = knc2.getId();
        q.d(id4, 7, knc3.getId(), 6);
        new l2a(q, 7, id4, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        q.d(id4, 6, appCompatTextView.getId(), 7);
        q.d(id4, 3, 0, 3);
        int id5 = knc3.getId();
        q.d(id5, 7, 0, 7);
        q.d(id5, 3, 0, 3);
        q.a(this);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getContextHeight() {
        /*
            r4 = this;
            int r0 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0010
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0011
        L_0x0010:
            r1 = r3
        L_0x0011:
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r1 = r1.bottomMargin
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r1 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0024
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x0024:
            if (r3 == 0) goto L_0x0028
            int r2 = r3.topMargin
        L_0x0028:
            int r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in1.getContextHeight():int");
    }

    private final u31 getContextMenuDelegate() {
        return (u31) this.G0.getValue();
    }

    public static void w(in1 in1) {
        u31 contextMenuDelegate = in1.getContextMenuDelegate();
        cu3 a = contextMenuDelegate.a(in1.getContext(), v6.a, new f9(contextMenuDelegate, 10, in1));
        a.showAtLocation(in1, 49, 0, in1.getContextHeight());
        a.setOnDismissListener(new m11(1, in1));
        pq9 pq9 = qp4.u0;
        knc knc = in1.I0;
        knc.setIconTint(pq9.p(knc).c.getIcon().g);
        knc.setMode(fnc.o);
    }

    public final void setCallTime(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.K0;
        appCompatTextView.setText(charSequence);
        ft.g(appCompatTextView, !(charSequence == null || w9e.C0(charSequence)), 0, (m56) null, 6);
    }

    public final void setClickListener(ln1 ln1) {
        this.L0 = ln1;
    }

    public final void setMembers(Integer num) {
        if (!tpa.f(this.N0, num)) {
            this.N0 = num;
            boolean z = false;
            int i = num != null ? 0 : 4;
            knc knc = this.H0;
            knc.setVisibility(i);
            if (num != null) {
                if (num.intValue() <= 1) {
                    z = true;
                }
                knc.B(knc, z ? ztb.ic_add_user_18 : ztb.ic_add_more_users_22);
                knc.setCounter(num.intValue());
                knc.setAccessibility(z ? getContext().getString(f0c.call_member_add_accessibility) : String.format(getContext().getString(f0c.call_member_add_more_accessibility), Arrays.copyOf(new Object[]{num.toString()}, 1)));
            }
        }
    }

    public final void setMode(nnf nnf) {
        if (this.M0 != nnf) {
            this.M0 = nnf;
            int i = nnf == null ? -1 : hn1.$EnumSwitchMapping$0[nnf.ordinal()];
            Integer num = null;
            if (i != -1) {
                if (i == 1) {
                    num = Integer.valueOf(ztb.ic_call_mode_default_18);
                } else if (i == 2) {
                    num = Integer.valueOf(ztb.ic_call_mode_grid_24);
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            knc knc = this.I0;
            if (num == null) {
                knc.setVisibility(4);
            } else {
                knc.setVisibility(0);
            }
            if (num != null) {
                knc.B(knc, num.intValue());
            }
        }
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.J0;
        if (!tpa.f(appCompatTextView.getText(), charSequence)) {
            appCompatTextView.setText(charSequence);
            ft.g(appCompatTextView, !(charSequence == null || w9e.C0(charSequence)), 0, (m56) null, 6);
        }
    }
}
