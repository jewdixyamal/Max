package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.InsetDrawable;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.nano.Protos;

/* renamed from: a5  reason: default package */
public final /* synthetic */ class a5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return AccountManager.get(this.b);
            case 1:
                return kt3.b(this.b, woc.p0);
            case 2:
                return new InsetDrawable(kt3.b(this.b, woc.L0), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
            case 3:
                return new InsetDrawable(kt3.b(this.b, woc.H0), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
            case 4:
                return (AudioManager) this.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 5:
                return new bme(this.b);
            case 6:
                ca9 ca9 = new ca9(this.b);
                float f = (float) 28;
                ca9.setBounds(0, 0, tu0.G(fk4.c() * f), tu0.G(fk4.c() * f));
                return ca9;
            case 7:
                return tpa.u(this.b);
            case 8:
                return tpa.u(this.b);
            case 9:
                ap1 ap1 = new ap1(this.b, (AttributeSet) null);
                ap1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ap1.setMode(yo1.c);
                ap1.setVideoLayoutUpdatesControllerProvider(new k11(24));
                return ap1;
            case 10:
                return tpa.u(this.b);
            case 11:
                Space space = new Space(this.b);
                space.setId(View.generateViewId());
                space.setLayoutParams(new ti3(-1, 0));
                return space;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Space space2 = new Space(this.b);
                space2.setId(View.generateViewId());
                space2.setLayoutParams(new ti3(-1, 0));
                return space2;
            case 13:
                return new mcc(this.b);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                knc knc = new knc(this.b, (AttributeSet) null);
                knc.setId(y7a.J1);
                knc.setMode(fnc.b);
                float f2 = (float) 60;
                knc.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                knc.setLayoutParams(new ti3(-2, -2));
                knc.setButtonPadding(tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
                knc.setVisibility(8);
                return knc;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                knc knc2 = new knc(this.b, (AttributeSet) null);
                knc2.setId(y7a.I1);
                knc2.setMode(fnc.a);
                float f3 = (float) 60;
                knc2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                knc2.setLayoutParams(new ti3(-2, -2));
                knc2.setButtonPadding(tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
                knc2.setVisibility(8);
                return knc2;
            case 16:
                return tpa.u(this.b);
            case LangUtils.HASH_SEED /*17*/:
                k4c k4c = new k4c(this.b);
                float f4 = (float) 60;
                k4c.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                return k4c;
            case 18:
                TextView textView = new TextView(this.b);
                textView.setId(y7a.F1);
                textView.setGravity(17);
                i4f.x.b(textView, du4.b);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(qp4.u0.p(textView).c.getText().e);
                textView.setVisibility(8);
                textView.setLayoutParams(new ti3(-1, -2));
                return textView;
            case 19:
                TextView textView2 = new TextView(this.b);
                textView2.setId(y7a.G1);
                textView2.setGravity(17);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                i4f.n.b(textView2, du4.b);
                textView2.setTextColor(qp4.u0.p(textView2).c.getText().h);
                textView2.setVisibility(8);
                textView2.setLayoutParams(new ti3(-1, -2));
                return textView2;
            case 20:
                dm1 dm1 = new dm1(this.b, (AttributeSet) null);
                dm1.setId(y7a.L1);
                dm1.setLayoutParams(new ti3(-1, -2));
                dm1.setVisibility(8);
                return dm1;
            case 21:
                return kt3.b(this.b, x7a.e0);
            case 22:
                return kt3.b(this.b, x7a.l0);
            case 23:
                return kt3.b(this.b, x7a.b0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                t21 t21 = new t21(this.b);
                t21.setLayoutParams(new ti3(-1, -1));
                t21.setVisibility(8);
                return t21;
            case 25:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, (AttributeSet) null);
                float f5 = (float) 32;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388629;
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                v3c.y(new a02(3, (Continuation) null, 0), appCompatImageView);
                int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
                appCompatImageView.setPadding(G, G, G, G);
                return appCompatImageView;
            case 26:
                TextView textView3 = new TextView(this.b);
                i4f.p.b(textView3, du4.b);
                textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f6 = (float) 12;
                textView3.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f6), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), tu0.G(f6 * fk4.d().getDisplayMetrics().density), textView3.getPaddingBottom());
                textView3.setTextColor(qp4.u0.j(textView3).getText().b);
                return textView3;
            case 27:
                SharedPreferences sharedPreferences = this.b.getSharedPreferences("one.me.sdk.design.theme", 0);
                sharedPreferences.getAll();
                return sharedPreferences;
            case 28:
                return Boolean.valueOf(((InputMethodManager) this.b.getSystemService("input_method")).isActive());
            default:
                return a14.m(this.b);
        }
    }

    public /* synthetic */ a5(Context context, xg1 xg1) {
        this.a = 9;
        this.b = context;
    }
}
