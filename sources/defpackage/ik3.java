package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ik3  reason: default package */
public final /* synthetic */ class ik3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ lk3 c;

    public /* synthetic */ ik3(Context context, lk3 lk3, int i) {
        this.a = i;
        this.b = context;
        this.c = lk3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return lk3.w(this.b, this.c);
            case 1:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, (AttributeSet) null);
                appCompatTextView.setId(xoc.E);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setSingleLine();
                appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().g);
                i4f.m.b(appCompatTextView, du4.b);
                this.c.addView(appCompatTextView, new ti3(0, tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density)));
                return appCompatTextView;
            case 2:
                TextView textView = new TextView(this.b);
                textView.setId(xoc.y);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setTextColor(qp4.u0.j(textView).getText().g);
                i4f.q.b(textView, du4.b);
                this.c.addView(textView, new ti3(0, tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density)));
                return textView;
            case 3:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(xoc.D);
                qp4.u0.j(imageView).getIcon();
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                float f = (float) 40;
                this.c.addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                return imageView;
            case 4:
                OneMeButton oneMeButton = new OneMeButton(this.b, (AttributeSet) null);
                oneMeButton.setId(xoc.B);
                oneMeButton.setSize(c7a.b);
                oneMeButton.setMode(b7a.o);
                oneMeButton.setAppearance(z6a.a);
                this.c.addView(oneMeButton, new ti3(-2, -2));
                return oneMeButton;
            case 5:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, (AttributeSet) null);
                appCompatImageView.setId(xoc.M);
                appCompatImageView.setImageResource(pub.videocam_outline_24);
                lk3 lk3 = this.c;
                fka customTheme = lk3.getCustomTheme();
                if (customTheme == null) {
                    customTheme = qp4.u0.j(appCompatImageView);
                }
                appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                int G = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                appCompatImageView.setPadding(G, G, G, G);
                int i = customTheme.d().a.a.c;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                float f2 = (float) 40;
                lk3.addView(appCompatImageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                return appCompatImageView;
            default:
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.b, (AttributeSet) null);
                appCompatImageView2.setId(xoc.z);
                appCompatImageView2.setImageResource(pub.ic_audio_call_type_24);
                lk3 lk32 = this.c;
                fka customTheme2 = lk32.getCustomTheme();
                if (customTheme2 == null) {
                    customTheme2 = qp4.u0.j(appCompatImageView2);
                }
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                int G2 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                appCompatImageView2.setPadding(G2, G2, G2, G2);
                int i2 = customTheme2.d().a.a.c;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                float f3 = (float) 40;
                lk32.addView(appCompatImageView2, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                return appCompatImageView2;
        }
    }
}
