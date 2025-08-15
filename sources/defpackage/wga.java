package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* renamed from: wga  reason: default package */
public final /* synthetic */ class wga implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ AttributeSet c;
    public final /* synthetic */ eha o;

    public /* synthetic */ wga(Context context, AttributeSet attributeSet, eha eha, int i) {
        this.a = i;
        this.b = context;
        this.c = attributeSet;
        this.o = eha;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, this.c);
                appCompatImageView.setId(xoc.u0);
                int G = tu0.G(((float) 30) * fk4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(G, G);
                layoutParams.gravity = 8388627;
                eha eha = this.o;
                layoutParams.leftMargin = eha.c;
                appCompatImageView.setLayoutParams(layoutParams);
                int G2 = tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density);
                appCompatImageView.setPadding(G2, G2, G2, G2);
                appCompatImageView.setImageResource(woc.d0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().f));
                tu0.K(appCompatImageView, 300, new xga(eha, 1));
                eha.addView(appCompatImageView);
                return appCompatImageView;
            case 1:
                AppCompatEditText appCompatEditText = new AppCompatEditText(this.b, this.c);
                appCompatEditText.setId(xoc.v0);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                layoutParams2.gravity = 8388629;
                int G3 = tu0.G(((float) 30) * fk4.d().getDisplayMetrics().density);
                eha eha2 = this.o;
                int i = eha2.c;
                layoutParams2.leftMargin = G3 + i + i;
                int i2 = eha2.a;
                layoutParams2.topMargin = i2;
                layoutParams2.bottomMargin = i2;
                appCompatEditText.setLayoutParams(layoutParams2);
                appCompatEditText.setClipToOutline(true);
                appCompatEditText.setOutlineProvider(new ix3((float) tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density)));
                appCompatEditText.setImeOptions(3);
                appCompatEditText.setText(eha2.o);
                int G4 = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
                int i3 = eha2.b;
                appCompatEditText.setPadding(i, i3, G4, i3);
                pq9 pq9 = qp4.u0;
                appCompatEditText.setBackgroundColor(pq9.j(appCompatEditText).b().a.g);
                i4f.l.b(appCompatEditText, du4.b);
                Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    ngg.G(textCursorDrawable, pq9.j(appCompatEditText).getText().j);
                }
                appCompatEditText.setHintTextColor(pq9.j(appCompatEditText).getText().g);
                appCompatEditText.setTextColor(pq9.j(appCompatEditText).getText().e);
                appCompatEditText.setSingleLine();
                appCompatEditText.setOnEditorActionListener(new zga(appCompatEditText));
                pla.a(appCompatEditText, new q57(17, appCompatEditText, appCompatEditText));
                appCompatEditText.addTextChangedListener(new z2(5, eha2));
                eha2.addView(appCompatEditText);
                return appCompatEditText;
            case 2:
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.b, this.c);
                appCompatImageView2.setId(xoc.x0);
                int G5 = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(G5, G5);
                layoutParams3.gravity = 8388629;
                appCompatImageView2.setLayoutParams(layoutParams3);
                int G6 = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
                appCompatImageView2.setPadding(G6, G6, G6, G6);
                appCompatImageView2.setImageResource(woc.O0);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().f));
                eha eha3 = this.o;
                tu0.K(appCompatImageView2, 300, new xga(eha3, 0));
                eha3.addView(appCompatImageView2);
                return appCompatImageView2;
            case 3:
                ImageView imageView = new ImageView(this.b, this.c);
                imageView.setId(xoc.y0);
                float f = (float) 32;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams4.gravity = 8388629;
                imageView.setLayoutParams(layoutParams4);
                int G7 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                imageView.setPadding(G7, G7, G7, G7);
                imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
                imageView.setImageResource(woc.O0);
                eha eha4 = this.o;
                tu0.K(imageView, 300, new xga(eha4, 2));
                v3c.y(new br(3, (Continuation) null, 11), imageView);
                eha4.addView(imageView);
                return imageView;
            default:
                AppCompatImageView appCompatImageView3 = new AppCompatImageView(this.b, this.c);
                appCompatImageView3.setId(xoc.w0);
                int G8 = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(G8, G8);
                layoutParams5.gravity = 8388629;
                appCompatImageView3.setLayoutParams(layoutParams5);
                eha eha5 = this.o;
                Editable text = ((AppCompatEditText) eha5.C0.getValue()).getText();
                int i4 = 0;
                if (!(!(text == null || text.length() == 0))) {
                    i4 = 8;
                }
                appCompatImageView3.setVisibility(i4);
                int G9 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                appCompatImageView3.setPadding(G9, G9, G9, G9);
                appCompatImageView3.setImageResource(woc.n0);
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView3).getIcon().j));
                tu0.K(appCompatImageView3, 300, new xga(eha5, 3));
                eha5.addView(appCompatImageView3);
                return appCompatImageView3;
        }
    }
}
