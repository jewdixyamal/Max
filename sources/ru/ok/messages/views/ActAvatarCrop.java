package ru.ok.messages.views;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.views.widgets.AvatarCropView;

public class ActAvatarCrop extends q5 implements gd0 {
    public static final /* synthetic */ int d1 = 0;
    public AvatarCropView U0;
    public ImageView V0;
    public ImageView W0;
    public ImageView X0;
    public OneMeButton Y0;
    public ImageView Z0;
    public Point a1;
    public final Matrix b1 = new Matrix();
    public boolean c1 = false;

    public final String Z() {
        return "AVATAR_CROP";
    }

    public final void d0() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        pq9 pq9 = qp4.u0;
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.clearFlags(67108864);
            window.setStatusBarColor(getColor(gtb.transparent));
            window.setNavigationBarColor(pq9.b(this).i().b().a.j);
        }
        setContentView(yyb.act_avatar_crop);
        Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI");
        findViewById(xxb.bottom_background).setBackgroundColor(pq9.b(this).i().b().a.j);
        pq9.b(this).i().getIcon();
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        ImageView imageView = (ImageView) findViewById(xxb.rotate);
        this.V0 = imageView;
        imageView.setImageTintList(valueOf);
        this.V0.setOnClickListener(new k5(this, 0));
        ImageView imageView2 = (ImageView) findViewById(xxb.flip_horizontally);
        this.W0 = imageView2;
        imageView2.setImageTintList(valueOf);
        this.W0.setOnClickListener(new k5(this, 1));
        ImageView imageView3 = (ImageView) findViewById(xxb.close);
        this.X0 = imageView3;
        imageView3.setImageTintList(valueOf);
        this.X0.setOnClickListener(new k5(this, 2));
        OneMeButton oneMeButton = (OneMeButton) findViewById(xxb.reset);
        this.Y0 = oneMeButton;
        oneMeButton.setText(a2c.f1oneme_avatar_rop_reset);
        this.Y0.setSize(c7a.a);
        this.Y0.setMode(b7a.o);
        this.Y0.setAppearance(z6a.X);
        this.Y0.setOnClickListener(new k5(this, 3));
        ImageView imageView4 = (ImageView) findViewById(xxb.done);
        this.Z0 = imageView4;
        imageView4.setImageTintList(valueOf);
        this.Z0.setOnClickListener(new k5(this, 4));
        this.U0 = (AvatarCropView) findViewById(xxb.crop);
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false)) {
            this.U0.setMode(1);
            setRequestedOrientation(1);
        } else {
            this.U0.setMode(0);
        }
        this.U0.setZoomEnabled(true);
        AvatarCropView avatarCropView = this.U0;
        ma6 ma6 = new ma6(getResources());
        ma6.l = ssc.o;
        ma6.b = 0;
        avatarCropView.setHierarchy(ma6.a());
        e2b a = s36.a.get();
        a.c(uri);
        a.h = new n5(0, this);
        this.U0.setController(a.a());
        this.U0.setTransformChangeListener(this);
    }

    public final void onResume() {
        super.onResume();
        an9 m = ((y8a) ((ed3) this.K0.b)).m();
        wuc wuc = wuc.AVATAR_PICKER_CROP;
        spa spa = spa.f;
        m.f(wuc, spa.f);
    }
}
