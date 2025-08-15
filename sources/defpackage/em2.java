package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: em2  reason: default package */
public final class em2 implements i8e {
    public final /* synthetic */ int a;
    public final m56 b;

    public /* synthetic */ em2(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public final Object a(int i) {
        switch (this.a) {
            case 0:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 1:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 2:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 3:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 4:
                return d(i);
            default:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
        }
    }

    public final c8e b(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return new dm2(new TextView(viewGroup.getContext()));
            case 1:
                return new nz2(new TextView(viewGroup.getContext()));
            case 2:
                return new ks3(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
            case 3:
                return new f57(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
            case 4:
                return new uf7(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null, 0));
            default:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.addView(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
                return new r7c(frameLayout);
        }
    }

    public final void c(c8e c8e, int i) {
        switch (this.a) {
            case 0:
                ((dm2) c8e).o.setText((CharSequence) a(i));
                return;
            case 1:
                ((nz2) c8e).o.setText((CharSequence) a(i));
                return;
            case 2:
                ((ks3) c8e).o.setText((CharSequence) a(i));
                return;
            case 3:
                ((f57) c8e).o.setText((CharSequence) a(i));
                return;
            case 4:
                Character d = d(i);
                TextView textView = ((uf7) c8e).o;
                if (d != null) {
                    textView.setText(new char[]{d.charValue()}, 0, 1);
                    return;
                }
                textView.setText((CharSequence) null);
                return;
            default:
                TextView textView2 = ((r7c) c8e).o;
                textView2.setText((CharSequence) a(i));
                textView2.setTextSize(1, 14.0f);
                return;
        }
    }

    public Character d(int i) {
        char c;
        Character ch = null;
        if (i < 0) {
            return null;
        }
        CharSequence charSequence = (CharSequence) this.b.invoke(Integer.valueOf(i));
        if (charSequence == null) {
            return null;
        }
        Character u0 = w9e.u0(charSequence);
        if (u0 != null) {
            if (Character.isLetter(u0.charValue())) {
                ch = u0;
            }
            if (ch != null) {
                c = Character.toUpperCase(ch.charValue());
                return Character.valueOf(c);
            }
        }
        c = '#';
        return Character.valueOf(c);
    }
}
