package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AppCompatImageButton extends ImageButton {
    public final x8 a;
    public final jn b;
    public boolean c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.imageButtonStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.i();
        }
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.g();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.C();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        qh3 qh3;
        jn jnVar = this.b;
        if (jnVar == null || (qh3 = (qh3) jnVar.o) == null) {
            return null;
        }
        return (ColorStateList) qh3.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        qh3 qh3;
        jn jnVar = this.b;
        if (jnVar == null || (qh3 = (qh3) jnVar.o) == null) {
            return null;
        }
        return (PorterDuff.Mode) qh3.e;
    }

    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.b.c).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.H();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.I(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.g();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        jn jnVar = this.b;
        if (!(jnVar == null || drawable == null || this.c)) {
            jnVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (jnVar != null) {
            jnVar.g();
            if (!this.c) {
                ImageView imageView = (ImageView) jnVar.c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(jnVar.b);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    public void setImageResource(int i) {
        jn jnVar = this.b;
        ImageView imageView = (ImageView) jnVar.c;
        if (i != 0) {
            Drawable n = s36.n(imageView.getContext(), i);
            if (n != null) {
                hq4.a(n);
            }
            imageView.setImageDrawable(n);
        } else {
            imageView.setImageDrawable((Drawable) null);
        }
        jnVar.g();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.g();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.O(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.P(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        jn jnVar = this.b;
        if (jnVar != null) {
            if (((qh3) jnVar.o) == null) {
                jnVar.o = new qh3(2);
            }
            qh3 qh3 = (qh3) jnVar.o;
            qh3.d = colorStateList;
            qh3.c = true;
            jnVar.g();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.b;
        if (jnVar != null) {
            if (((qh3) jnVar.o) == null) {
                jnVar.o = new qh3(2);
            }
            qh3 qh3 = (qh3) jnVar.o;
            qh3.e = mode;
            qh3.b = true;
            jnVar.g();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vue.a(context);
        this.c = false;
        gse.a(getContext(), this);
        x8 x8Var = new x8((View) this);
        this.a = x8Var;
        x8Var.E(attributeSet, i);
        jn jnVar = new jn((ImageView) this);
        this.b = jnVar;
        jnVar.E(attributeSet, i);
    }
}
