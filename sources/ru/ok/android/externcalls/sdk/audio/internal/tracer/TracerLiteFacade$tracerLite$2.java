package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.BuildConfig;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwye;", "invoke", "()Lwye;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class TracerLiteFacade$tracerLite$2 extends rd7 implements k56 {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$tracerLite$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final wye invoke() {
        Context applicationContext = this.$context.getApplicationContext();
        AnonymousClass1 r1 = AnonymousClass1.INSTANCE;
        uye uye = new uye();
        r1.invoke(uye);
        wye wye = new wye(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new l7b(uye));
        wye.b(TracerLiteFacade.KEY_AUDIOMANAGER_VERSION, BuildConfig.SDK_VERSION);
        return wye;
    }
}
