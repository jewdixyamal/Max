package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import ru.ok.messages.messages.widgets.MessageComposeEditText;

public class MediaBarPreviewLayout extends ConstraintLayout implements t48, nse {
    public static final /* synthetic */ int b1 = 0;
    public final bk4 G0;
    public final View H0;
    public final View I0;
    public final View J0;
    public final RecyclerView K0;
    public final View L0;
    public final ImageButton M0;
    public final ImageButton N0;
    public final ImageButton O0;
    public final ImageButton P0;
    public final MessageComposeEditText Q0;
    public final xp7 R0;
    public final s48 S0;
    public r48 T0;
    public Toast U0;
    public final tg V0;
    public final p7b W0;
    public boolean X0 = false;
    public boolean Y0 = true;
    public boolean Z0 = false;
    public int a1 = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBarPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ed3 b = vl.b();
        getContext();
        bk4 b2 = bk4.b();
        this.G0 = b2;
        y8a y8a = (y8a) b;
        tg c = y8a.c();
        this.V0 = c;
        xp7 j = y8a.j();
        this.R0 = j;
        o20 d = y8a.d();
        this.W0 = y8a.n();
        View.inflate(getContext(), yyb.cl_media_bar_preview_layout, this);
        this.I0 = findViewById(xxb.cl_media_bar_preview_layout__top_panel);
        this.H0 = findViewById(xxb.cl_media_bar_preview_layout__bottom_panel);
        this.J0 = findViewById(xxb.media_bar_view__bottom_shadow);
        this.L0 = findViewById(xxb.cl_media_bar_preview_layout__separator_middle);
        RecyclerView recyclerView = (RecyclerView) findViewById(xxb.cl_media_bar_preview_layout__rv_selected);
        this.K0 = recyclerView;
        ImageButton imageButton = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_send);
        this.M0 = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_file);
        this.N0 = imageButton2;
        ImageButton imageButton3 = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_collage);
        this.O0 = imageButton3;
        ImageButton imageButton4 = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_cancel);
        this.P0 = imageButton4;
        MessageComposeEditText messageComposeEditText = (MessageComposeEditText) findViewById(xxb.cl_media_bar_preview_layout__edit_message);
        this.Q0 = messageComposeEditText;
        c();
        w();
        recyclerView.setHasFixedSize(true);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(new yb4());
        recyclerView.j(new d71(b2.b, 4));
        s48 s48 = new s48(getContext(), this, c, d, j, (cq7) y8a.getAccessor().c(cq7.class));
        this.S0 = s48;
        s48.A(true);
        recyclerView.setAdapter(this.S0);
        messageComposeEditText.addTextChangedListener(new z2(3, this));
        messageComposeEditText.setInputType(933968);
        new vqe(messageComposeEditText, c54.a(messageComposeEditText.getContext())).a();
        tu0.K(imageButton, 300, new q48(this, 0));
        imageButton.setLongClickable(true);
        imageButton.setOnLongClickListener(new zl0(3, this));
        tu0.K(imageButton2, 300, new q48(this, 1));
        tu0.K(imageButton3, 300, new q48(this, 2));
        tu0.K(imageButton4, 300, new q48(this, 3));
    }

    public final void A() {
        boolean z = false;
        boolean z2 = true;
        boolean z3 = this.W0.c.u() && !this.Y0;
        this.Y0 = false;
        xp7 xp7 = this.R0;
        int b = xp7.f.b();
        View view = this.I0;
        if (b == 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            int i = this.a1;
            if (i != -1 && i < b) {
                this.K0.B0(b - 1);
            }
        }
        this.a1 = b;
        boolean z4 = this.X0;
        p4d p4d = xp7.f;
        ImageButton imageButton = this.N0;
        ImageButton imageButton2 = this.O0;
        if (z4) {
            imageButton2.setVisibility(8);
            imageButton.setVisibility(8);
            if (p4d.b() > 0) {
                z = true;
            }
            B(z);
        } else {
            this.M0.setVisibility(0);
            int b2 = p4d.b();
            boolean z5 = b2 > 1;
            tg tgVar = this.V0;
            if (z3) {
                if (z5) {
                    tgVar.a(imageButton2);
                } else {
                    tgVar.c(imageButton2);
                }
            } else if (z5) {
                imageButton2.setVisibility(0);
            } else {
                imageButton2.setVisibility(8);
            }
            if (!this.Z0 && b2 <= 0) {
                z2 = false;
            }
            if (z3) {
                if (z2) {
                    tgVar.a(imageButton);
                } else {
                    tgVar.c(imageButton);
                }
            } else if (z2) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
        }
        CharSequence charSequence = p4d.k;
        if (charSequence != null) {
            this.Q0.setText(charSequence);
        }
        w();
        this.S0.m();
    }

    public final void B(boolean z) {
        Editable text = this.Q0.getText();
        this.M0.setVisibility((z || !TextUtils.isEmpty(text != null ? text.toString().trim() : null)) ? 0 : 8);
    }

    public final void c() {
        Context context = getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        setBackgroundColor(0);
        this.K0.setBackgroundColor(R.m);
        View view = this.I0;
        int i = R.m;
        view.setBackgroundColor(i);
        this.H0.setBackgroundColor(i);
        this.L0.setBackgroundColor(R.K);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageButton imageButton = this.M0;
        int i2 = R.k;
        imageButton.setColorFilter(i2, mode);
        imageButton.setBackground(R.a());
        ti3 ti3 = (ti3) imageButton.getLayoutParams();
        ti3.width = -2;
        imageButton.setLayoutParams(ti3);
        j47.U(imageButton, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageButton.getLayoutParams();
        if (marginLayoutParams.bottomMargin != 0) {
            marginLayoutParams.bottomMargin = 0;
            imageButton.setLayoutParams(marginLayoutParams);
        }
        RippleDrawable a = R.a();
        ImageButton imageButton2 = this.N0;
        imageButton2.setBackground(a);
        RippleDrawable a2 = R.a();
        ImageButton imageButton3 = this.O0;
        imageButton3.setBackground(a2);
        int i3 = R.w;
        imageButton2.setColorFilter(i3, mode);
        imageButton3.setColorFilter(i3, mode);
        ImageButton imageButton4 = this.P0;
        imageButton4.setColorFilter(i3, mode);
        imageButton4.setBackground(R.a());
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(R.i), i != 0 ? new ColorDrawable(i) : null, (Drawable) null);
        rippleDrawable.setRadius(this.G0.n);
        imageButton4.setBackground(rippleDrawable);
        MessageComposeEditText messageComposeEditText = this.Q0;
        messageComposeEditText.setTextColor(R.F);
        messageComposeEditText.setHintTextColor(R.M);
        Class<TextView> cls = TextView.class;
        try {
            Field declaredField = cls.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i4 = declaredField.getInt(messageComposeEditText);
            Field declaredField2 = cls.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(messageComposeEditText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable b = kt3.b(messageComposeEditText.getContext(), i4);
            b.setColorFilter(new PorterDuffColorFilter(i2, mode));
            Drawable b2 = kt3.b(messageComposeEditText.getContext(), i4);
            b2.setColorFilter(new PorterDuffColorFilter(i2, mode));
            declaredField3.set(obj, new Drawable[]{b, b2});
        } catch (Throwable unused) {
        }
    }

    public int getBottomShadowHeight() {
        return this.J0.getHeight();
    }

    public int getContentHeight() {
        MessageComposeEditText messageComposeEditText = this.Q0;
        int measuredHeight = messageComposeEditText.getVisibility() == 0 ? messageComposeEditText.getMeasuredHeight() : 0;
        View view = this.I0;
        if (view.getVisibility() == 0) {
            measuredHeight += view.getMeasuredHeight();
        }
        int paddingBottom = getPaddingBottom();
        this.G0.getClass();
        if (paddingBottom < fk4.b((int) 200.0f)) {
            measuredHeight += getPaddingBottom();
        }
        return getPaddingTop() + measuredHeight;
    }

    public int getHeightWithoutShadow() {
        return getHeight() - this.J0.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0.getLayoutManager();
        r1 = r0.W0();
        r0 = r0.r(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getScrollPosition() {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.K0
            androidx.recyclerview.widget.a r1 = r0.getLayoutManager()
            boolean r1 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L_0x0039
            int r1 = r0.getWidth()
            if (r1 == 0) goto L_0x0039
            androidx.recyclerview.widget.a r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.W0()
            android.view.View r0 = r0.r(r1)
            if (r0 == 0) goto L_0x0039
            int r0 = r0.getLeft()
            bk4 r2 = r2.G0
            int r2 = r2.i
            int r2 = r2 / 2
            int r0 = r0 - r2
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L_0x0039:
            android.util.Pair r2 = new android.util.Pair
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.MediaBarPreviewLayout.getScrollPosition():android.util.Pair");
    }

    public void setAnimojisEnabled(boolean z) {
        MessageComposeEditText messageComposeEditText = this.Q0;
        if (messageComposeEditText != null) {
            messageComposeEditText.setAnimojiEnabled(z);
        }
    }

    public void setChatMode(kl2 kl2) {
        int i = ((Boolean) kl2.a.getValue()).booleanValue() ? gpc.f0 : gpc.W;
        ImageButton imageButton = this.M0;
        imageButton.setImageResource(i);
        imageButton.setLongClickable(((Boolean) kl2.a.getValue()).booleanValue());
    }

    public void setFullScreen(boolean z) {
        this.Z0 = z;
        A();
        c();
    }

    public void setListener(r48 r48) {
        this.T0 = r48;
    }

    public void setMessageEdit(boolean z) {
        this.X0 = z;
        A();
        c();
    }

    public void setShouldApplyHighlight(boolean z) {
        this.S0.u0 = z;
    }

    public final void w() {
        int s = au1.s(this.R0.f.l);
        ImageButton imageButton = this.N0;
        ImageButton imageButton2 = this.O0;
        if (s == 1) {
            imageButton2.setImageResource(gpc.s);
            imageButton.setImageResource(gpc.B);
        } else if (s != 2) {
            imageButton2.setImageResource(gpc.s);
            imageButton.setImageResource(gpc.A);
        } else {
            imageButton2.setImageResource(gpc.t);
            imageButton.setImageResource(gpc.A);
        }
    }

    public final void x(int i) {
        RecyclerView recyclerView = this.K0;
        if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && recyclerView.getWidth() != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            View childAt = recyclerView.getChildAt(i);
            linearLayoutManager.n1(i, Math.max(0, (recyclerView.getWidth() / 2) - ((childAt != null ? childAt.getWidth() : getContext().getResources().getDimensionPixelOffset(jtb.compose_view_item_height) - this.G0.i) / 2)));
        }
    }

    public final void y(int i) {
        Toast toast = this.U0;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(getContext(), i, 0);
        this.U0 = makeText;
        makeText.show();
    }
}
