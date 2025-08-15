package ru.ok.messages.media.attaches;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Arrays;
import java.util.WeakHashMap;

public class FileAttachView extends ConstraintLayout implements wg9 {
    public static final Typeface X0 = Typeface.create("sans-serif", 0);
    public static final Typeface Y0 = Typeface.create("sans-serif", 1);
    public final ed3 G0 = vl.b();
    public final bk4 H0;
    public MessageAttachmentsLayout I0;
    public final ViewStub J0;
    public final ViewStub K0;
    public final AppCompatTextView L0;
    public final AppCompatTextView M0;
    public final AppCompatTextView N0;
    public final AppCompatImageView O0;
    public final AppCompatImageView P0;
    public final DraweeViewWithSensitiveWarningIcon Q0;
    public final SimpleDraweeView R0;
    public final AppCompatTextView S0;
    public final AppCompatImageView T0;
    public xg9 U0;
    public final sme V0;
    public final Barrier W0;

    public FileAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.H0 = bk4.b();
        ((y8a) this.G0).d();
        ((y8a) this.G0).n().getClass();
        cv8 cv8 = (cv8) ((y8a) this.G0).getAccessor().c(cv8.class);
        Context context2 = getContext();
        khe khe = sme.a0;
        this.V0 = fm9.R(context2);
        ((y8a) this.G0).p().getClass();
        dz dzVar = (dz) ((jyc) jke.b()).getAccessor().c(dz.class);
        ViewStub viewStub = new ViewStub(getContext());
        this.J0 = viewStub;
        viewStub.setId(xxb.view_file_attach__attachments);
        this.J0.setInflatedId(xxb.view_file_attach__attachments);
        this.J0.setLayoutResource(yyb.ll_view_file_attach__message_attachments_layout_view);
        ti3 ti3 = new ti3(-2, -2);
        ti3.i = 0;
        ti3.t = 0;
        ti3.v = 0;
        int i = this.H0.i;
        ti3.rightMargin = i;
        ti3.leftMargin = i;
        ti3.W = true;
        addView(this.J0, ti3);
        this.K0 = new ViewStub(getContext());
        ti3 ti32 = new ti3(-2, -2);
        this.K0.setId(xxb.view_file_attach__sticker);
        this.K0.setInflatedId(xxb.view_file_attach__sticker);
        this.K0.setLayoutResource(yyb.ll_view_file_attach__sticker_view);
        ti32.i = 0;
        ti32.t = 0;
        ti32.v = 0;
        addView(this.K0, ti32);
        Barrier barrier = new Barrier(getContext());
        this.W0 = barrier;
        barrier.setId(xxb.view_file_attach__big_preview_barrier);
        this.W0.setType(3);
        this.W0.setReferencedIds(new int[]{xxb.view_file_attach__attachments, xxb.view_file_attach__sticker});
        addView(this.W0, new ti3(-2, -2));
        int i2 = this.H0.u;
        ti3 ti33 = new ti3(i2, i2);
        ti33.j = xxb.view_file_attach__big_preview_barrier;
        ti33.l = 0;
        ti33.t = 0;
        ti33.setMarginStart(this.H0.i);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.R0 = simpleDraweeView;
        simpleDraweeView.setId(xxb.view_file_attach__iv_bg);
        wnc wnc = new wnc();
        float[] fArr = new float[8];
        wnc.c = fArr;
        Arrays.fill(fArr, (float) this.H0.j);
        ((la6) this.R0.getHierarchy()).n(wnc);
        this.R0.setClickable(false);
        addView(this.R0, ti33);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.S0 = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.S0.setTypeface(Y0);
        this.S0.setTextSize(0, this.H0.H);
        this.S0.setTextColor(this.V0.s);
        AppCompatTextView appCompatTextView2 = this.S0;
        int i3 = this.H0.b;
        appCompatTextView2.setPadding(i3, i3, i3, i3);
        this.S0.setMaxLines(1);
        AppCompatTextView appCompatTextView3 = this.S0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        appCompatTextView3.setEllipsize(truncateAt);
        this.S0.setAllCaps(true);
        ti3 ti34 = new ti3(0, 0);
        int i4 = xxb.view_file_attach__iv_bg;
        ti34.i = i4;
        ti34.t = i4;
        ti34.v = i4;
        ti34.l = i4;
        addView(this.S0, ti34);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.T0 = appCompatImageView;
        appCompatImageView.setImageDrawable(kt3.b(getContext(), gpc.g0));
        ti3 ti35 = new ti3(-2, -2);
        int i5 = xxb.view_file_attach__iv_bg;
        ti35.i = i5;
        ti35.t = i5;
        ti35.v = i5;
        ti35.l = i5;
        addView(this.T0, ti35);
        DraweeViewWithSensitiveWarningIcon draweeViewWithSensitiveWarningIcon = new DraweeViewWithSensitiveWarningIcon(getContext(), (AttributeSet) null, 6);
        this.Q0 = draweeViewWithSensitiveWarningIcon;
        ((la6) draweeViewWithSensitiveWarningIcon.getHierarchy()).h(ssc.l);
        wnc wnc2 = new wnc();
        float[] fArr2 = new float[8];
        wnc2.c = fArr2;
        Arrays.fill(fArr2, (float) this.H0.f);
        ((la6) this.Q0.getHierarchy()).n(wnc2);
        this.Q0.setClickable(false);
        ti3 ti36 = new ti3(0, 0);
        int i6 = xxb.view_file_attach__iv_bg;
        ti36.i = i6;
        ti36.t = i6;
        ti36.v = i6;
        ti36.l = i6;
        addView(this.Q0, ti36);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.P0 = appCompatImageView2;
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER);
        ti3 ti37 = new ti3(-2, -2);
        int i7 = xxb.view_file_attach__iv_bg;
        ti37.i = i7;
        ti37.t = i7;
        ti37.v = i7;
        ti37.l = i7;
        tu0.K(this.P0, 800, new eg5(this, 0));
        addView(this.P0, ti37);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.L0 = appCompatTextView4;
        appCompatTextView4.setId(xxb.view_file_attach__tv_title);
        AppCompatTextView appCompatTextView5 = this.L0;
        int i8 = this.H0.i;
        WeakHashMap weakHashMap = zmf.a;
        appCompatTextView5.setPaddingRelative(i8, 0, i8, 0);
        AppCompatTextView appCompatTextView6 = this.L0;
        Typeface typeface = X0;
        appCompatTextView6.setTypeface(typeface);
        this.L0.setSingleLine();
        this.L0.setTextSize(0, this.H0.I);
        this.L0.setEllipsize(truncateAt);
        this.L0.setTextColor(this.V0.F);
        this.L0.setIncludeFontPadding(false);
        ti3 ti38 = new ti3(0, -2);
        int i9 = xxb.view_file_attach__iv_bg;
        ti38.i = i9;
        ti38.s = i9;
        ti38.u = xxb.view_file_attach__btn_load;
        ti38.k = xxb.view_file_attach__tv_subtitle;
        ti38.L = 1;
        ti38.K = 2;
        ti38.E = 0.0f;
        ti38.x = this.H0.i;
        ti38.topMargin = 0;
        addView(this.L0, ti38);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.M0 = appCompatTextView7;
        appCompatTextView7.setId(xxb.view_file_attach__tv_subtitle);
        AppCompatTextView appCompatTextView8 = this.M0;
        int i10 = this.H0.i;
        appCompatTextView8.setPaddingRelative(i10, 0, i10, 0);
        this.M0.setTypeface(typeface);
        this.M0.setSingleLine();
        this.M0.setTextSize(0, this.H0.I);
        AppCompatTextView appCompatTextView9 = this.M0;
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        appCompatTextView9.setEllipsize(truncateAt2);
        this.M0.setTextColor(this.V0.v);
        this.M0.setIncludeFontPadding(false);
        ti3 ti39 = new ti3(0, -2);
        ti39.j = xxb.view_file_attach__tv_title;
        ti39.s = xxb.view_file_attach__iv_bg;
        ti39.u = xxb.view_file_attach__btn_load;
        ti39.k = xxb.view_file_attach__tv_duration;
        ti39.L = 1;
        ti39.E = 0.0f;
        addView(this.M0, ti39);
        AppCompatTextView appCompatTextView10 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.N0 = appCompatTextView10;
        appCompatTextView10.setId(xxb.view_file_attach__tv_duration);
        AppCompatTextView appCompatTextView11 = this.N0;
        int i11 = this.H0.i;
        appCompatTextView11.setPaddingRelative(i11, 0, i11, 0);
        this.N0.setTypeface(typeface);
        this.N0.setSingleLine();
        this.N0.setTextSize(0, this.H0.H);
        this.N0.setEllipsize(truncateAt2);
        this.N0.setTextColor(this.V0.v);
        this.N0.setVisibility(8);
        ti3 ti310 = new ti3(0, -2);
        ti310.j = xxb.view_file_attach__tv_subtitle;
        int i12 = xxb.view_file_attach__iv_bg;
        ti310.s = i12;
        ti310.u = xxb.view_file_attach__btn_load;
        ti310.l = i12;
        ti310.L = 1;
        ti310.E = 0.0f;
        addView(this.N0, ti310);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.O0 = appCompatImageView3;
        appCompatImageView3.setId(xxb.view_file_attach__btn_load);
        this.O0.setScaleType(ImageView.ScaleType.FIT_XY);
        this.O0.setImageTintList(ColorStateList.valueOf(qp4.u0.j(this).a().d(true).b.g));
        int i13 = this.H0.s;
        ti3 ti311 = new ti3(i13, i13);
        ti311.j = xxb.view_file_attach__big_preview_barrier;
        ti311.v = 0;
        ti311.setMarginEnd(this.H0.f);
        tu0.K(this.O0, 800, new eg5(this, 1));
        addView(this.O0, ti311);
        nd7.h(this, new e5(7, this));
    }

    private xg9 getMusicAttachViewController() {
        if (this.U0 == null) {
            this.U0 = new xg9(this);
        }
        return this.U0;
    }

    private String getSubtitleForDownload() {
        throw null;
    }

    private String getSubtitleForUpload() {
        throw null;
    }

    public static void w(FileAttachView fileAttachView) {
        if (fileAttachView.U0 != null) {
            fileAttachView.getMusicAttachViewController().getClass();
            return;
        }
        throw null;
    }

    public final void g() {
        r20 r20 = new r20(getContext());
        r20.l.setColor(0);
        r20.c = this.H0.v;
        r20.d = true;
        throw null;
    }

    public ts8 getMessageAttachmentsView() {
        if (this.I0 == null) {
            this.I0 = (MessageAttachmentsLayout) this.J0.inflate();
        }
        return this.I0.getView();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.U0 != null) {
            xg9 musicAttachViewController = getMusicAttachViewController();
            getContext();
            musicAttachViewController.a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U0 != null) {
            getMusicAttachViewController().g = true;
        }
    }

    public void setArtistName(CharSequence charSequence) {
        this.M0.setVisibility(0);
        this.M0.setText(charSequence);
    }

    public void setDurationText(String str) {
        this.N0.setText(str);
    }

    public void setListener(fg5 fg5) {
        xg9 xg9 = this.U0;
        if (xg9 != null) {
            xg9.getClass();
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
    }

    public void setPipRequestListener(ss8 ss8) {
        getMessageAttachmentsView().setPipRequestListener(ss8);
    }

    public void setPlayButtonPauseSelector(boolean z) {
        getContext();
        int i = woc.a;
        throw null;
    }

    public void setPlayButtonPlaySelector(boolean z) {
        getContext();
        int i = woc.a;
        throw null;
    }

    public void setPlayButtonPreview(String str) {
    }

    public void setTrackName(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }
}
