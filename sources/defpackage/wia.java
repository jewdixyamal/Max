package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: wia  reason: default package */
public final class wia extends ConstraintLayout implements kre {
    public static final /* synthetic */ bc7[] N0;
    public final via G0 = new via(this, 0);
    public final via H0 = new via(this, 1);
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final AppCompatTextView L0;
    public final je7 M0;

    static {
        Class<wia> cls = wia.class;
        N0 = new bc7[]{new oi9(cls, "leftElement", "getLeftElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Left;"), rh4.g(nec.a, cls, "rightElement", "getRightElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Right;")};
    }

    public wia(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I0 = tu0.r(3, new xda(context, 2));
        this.J0 = tu0.r(3, new xda(context, 3));
        this.K0 = tu0.r(3, new xda(context, 4));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(qga.e);
        appCompatTextView.setLayoutParams(new ti3(tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), -2));
        i4f.l.b(appCompatTextView, du4.b);
        pq9 pq9 = qp4.u0;
        pq9.j(appCompatTextView).getText();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setMaxLines(2);
        this.L0 = appCompatTextView;
        this.M0 = tu0.r(3, new xda(context, 5));
        setId(qga.b);
        setLayoutParams(new ti3(-1, -2));
        setMinimumHeight(tu0.G(((float) 56) * fk4.d().getDisplayMetrics().density));
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        setPadding(G, G, G, G);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(pq9.j(this).b().d);
    }

    /* access modifiers changed from: private */
    public final void setLeft(oia oia) {
        if (oia instanceof kia) {
            setupLeftContrastIcon(((kia) oia).a);
        } else if (oia instanceof mia) {
            setupLeftNegativeIcon(((mia) oia).a);
        } else {
            boolean z = oia instanceof jia;
            je7 je7 = this.I0;
            if (z) {
                jia jia = (jia) oia;
                int i = jia.a;
                AppCompatImageView appCompatImageView = (AppCompatImageView) je7.getValue();
                appCompatImageView.setId(qga.c);
                appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), i));
                appCompatImageView.setImageTintList(ColorStateList.valueOf(jia.b));
                ay7.b(this, appCompatImageView, (Integer) null);
            } else if (oia instanceof nia) {
                gy3 gy3 = (gy3) this.J0.getValue();
                gy3.setId(qga.c);
                float f = (float) 28;
                gy3.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                gy3.setMaxValue(MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                ay7.b(this, gy3, (Integer) null);
            } else if (!(oia instanceof lia)) {
                throw new NoWhenBranchMatchedException();
            } else if (je7.a()) {
                ((AppCompatImageView) je7.getValue()).setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setRight(tia tia) {
        boolean f = tpa.f(tia, pia.a);
        je7 je7 = this.K0;
        if (f) {
            OneMeButton oneMeButton = (OneMeButton) je7.getValue();
            oneMeButton.setId(qga.d);
            oneMeButton.setText(rga.a);
            oneMeButton.setMode(b7a.o);
            ay7.b(this, oneMeButton, (Integer) null);
        } else if (tpa.f(tia, qia.a)) {
            OneMeButton oneMeButton2 = (OneMeButton) je7.getValue();
            oneMeButton2.setId(qga.d);
            oneMeButton2.d(Integer.valueOf(woc.G0), true);
            oneMeButton2.setMode(b7a.c);
            ay7.b(this, oneMeButton2, (Integer) null);
        } else if (tpa.f(tia, ria.a)) {
            if (je7.a()) {
                ((OneMeButton) je7.getValue()).setVisibility(8);
            }
        } else if (tia instanceof sia) {
            setupRightTextButton(((sia) tia).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void setupLeftContrastIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.I0.getValue();
        appCompatImageView.setId(qga.c);
        appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), i));
        qp4.u0.j(appCompatImageView).getIcon();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        ay7.b(this, appCompatImageView, (Integer) null);
    }

    private final void setupLeftNegativeIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.I0.getValue();
        appCompatImageView.setId(qga.c);
        appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), i));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().c));
        ay7.b(this, appCompatImageView, (Integer) null);
    }

    private final void setupRightTextButton(jqe jqe) {
        OneMeButton oneMeButton = (OneMeButton) this.K0.getValue();
        oneMeButton.setId(qga.d);
        oneMeButton.setText(jqe.b(oneMeButton.getContext()));
        oneMeButton.setMode(b7a.o);
        ay7.b(this, oneMeButton, (Integer) null);
    }

    public final oia getLeftElement() {
        bc7 bc7 = N0[0];
        return (oia) this.G0.b;
    }

    public final tia getRightElement() {
        bc7 bc7 = N0[1];
        return (tia) this.H0.b;
    }

    public final void onThemeChanged(fka fka) {
        setBackgroundColor(fka.b().d);
        Integer num = -1;
        this.L0.setTextColor(-1);
        je7 je7 = this.I0;
        if (je7.a()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) je7.getValue();
            oia leftElement = getLeftElement();
            if (!(leftElement instanceof kia)) {
                if (leftElement instanceof mia) {
                    num = Integer.valueOf(fka.getIcon().c);
                } else if (!(leftElement instanceof nia)) {
                    if (leftElement instanceof jia) {
                        num = Integer.valueOf(((jia) leftElement).b);
                    } else if (tpa.f(leftElement, lia.a)) {
                        num = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if (num != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(num.intValue()));
            }
        }
    }

    public final void setCaption(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.M0.getValue();
        appCompatTextView.setId(qga.a);
        appCompatTextView.setText(charSequence);
        int i = 0;
        if (charSequence == null) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        ay7.b(this, appCompatTextView, (Integer) null);
        y();
    }

    public final void setLeftElement(oia oia) {
        this.G0.o1(this, N0[0], oia);
    }

    public final void setRightBtnAction$snackbar_release(View.OnClickListener onClickListener) {
        je7 je7 = this.K0;
        if (je7.a()) {
            OneMeButton oneMeButton = (OneMeButton) je7.getValue();
            if (onClickListener == null) {
                oneMeButton.setOnClickListener((View.OnClickListener) null);
            } else {
                tu0.K(oneMeButton, 300, onClickListener);
            }
        }
    }

    public final void setRightElement(tia tia) {
        this.H0.o1(this, N0[1], tia);
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.L0;
        appCompatTextView.setText(charSequence);
        ay7.b(this, appCompatTextView, (Integer) null);
        y();
    }

    public final void y() {
        boolean z = br7.H(this.I0) || br7.H(this.J0);
        je7 je7 = this.K0;
        boolean H = br7.H(je7);
        je7 je72 = this.M0;
        boolean H2 = br7.H(je72);
        dj3 q = fp3.q(this);
        AppCompatTextView appCompatTextView = this.L0;
        sh0 sh0 = new sh0(appCompatTextView.getId(), 4, (Object) q);
        if (z) {
            au1.p((float) 12, fk4.d().getDisplayMetrics().density, sh0.C(qga.c));
        } else {
            sh0.D(0);
        }
        sh0.G(0);
        if (H) {
            au1.p((float) 12, fk4.d().getDisplayMetrics().density, sh0.p(((OneMeButton) je7.getValue()).getId()));
        } else {
            sh0.n(0);
        }
        if (H2) {
            sh0.f(((AppCompatTextView) je72.getValue()).getId());
        } else {
            sh0.e(0);
        }
        if (z) {
            sh0 sh02 = new sh0(qga.c, 4, (Object) q);
            sh02.D(0);
            sh02.G(0);
            sh02.e(0);
        }
        if (H2) {
            sh0 sh03 = new sh0(((AppCompatTextView) je72.getValue()).getId(), 4, (Object) q);
            if (z) {
                au1.p((float) 12, fk4.d().getDisplayMetrics().density, sh03.C(qga.c));
            } else {
                sh03.D(0);
            }
            if (H) {
                au1.p((float) 12, fk4.d().getDisplayMetrics().density, sh03.p(((OneMeButton) je7.getValue()).getId()));
            } else {
                sh03.n(0);
            }
            au1.p((float) 2, fk4.d().getDisplayMetrics().density, sh03.E(appCompatTextView.getId()));
        }
        if (H) {
            sh0 sh04 = new sh0(((OneMeButton) je7.getValue()).getId(), 4, (Object) q);
            sh04.G(0);
            sh04.n(0);
            sh04.e(0);
        }
        q.a(this);
    }

    public final void setTitle(int i) {
        setTitle((CharSequence) z7.B(getContext(), i));
    }

    public final void setCaption(int i) {
        setCaption((CharSequence) z7.B(getContext(), i));
    }
}
