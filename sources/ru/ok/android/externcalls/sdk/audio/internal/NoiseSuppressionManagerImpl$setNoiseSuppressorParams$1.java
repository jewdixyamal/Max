package ru.ok.android.externcalls.sdk.audio.internal;

import kotlin.Metadata;
import org.webrtc.PeerConnectionFactory;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvq9;", "builder", "Lwq9;", "invoke", "(Lvq9;)Lwq9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1 extends rd7 implements m56 {
    final /* synthetic */ boolean $clientsideAnn;
    final /* synthetic */ boolean $clientsidePlatform;
    final /* synthetic */ PeerConnectionFactory.EnhancerKind $enhancerKind;
    final /* synthetic */ int $fallbackStutterCountMillis;
    final /* synthetic */ int $fallbackTimeLimitMillis;
    final /* synthetic */ int $fallbackTimeframeMillis;
    final /* synthetic */ String $filePath;
    final /* synthetic */ int $inputSampleRate;
    final /* synthetic */ boolean $logTimings;
    final /* synthetic */ Runnable $onNoiseSuppressorDisabledDueToStutter;
    final /* synthetic */ int $outputSampleRate;
    final /* synthetic */ boolean $serversideAnn;
    final /* synthetic */ boolean $serversideBasic;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable) {
        super(1);
        this.$serversideBasic = z;
        this.$serversideAnn = z2;
        this.$clientsidePlatform = z3;
        this.$clientsideAnn = z4;
        this.$enhancerKind = enhancerKind;
        this.$filePath = str;
        this.$inputSampleRate = i;
        this.$outputSampleRate = i2;
        this.$fallbackTimeLimitMillis = i3;
        this.$fallbackStutterCountMillis = i4;
        this.$fallbackTimeframeMillis = i5;
        this.$logTimings = z5;
        this.$onNoiseSuppressorDisabledDueToStutter = runnable;
    }

    public final wq9 invoke(vq9 vq9) {
        int i;
        yh0 yh0;
        boolean z;
        vq9 vq92 = vq9;
        vq92.a = this.$serversideBasic;
        vq92.b = this.$serversideAnn;
        vq92.c = this.$clientsidePlatform;
        vq92.d = this.$clientsideAnn;
        PeerConnectionFactory.EnhancerKind enhancerKind = this.$enhancerKind;
        vq92.f = enhancerKind;
        if (enhancerKind == null) {
            i = -1;
        } else {
            i = uq9.$EnumSwitchMapping$1[enhancerKind.ordinal()];
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 2) {
                i2 = i != 3 ? 0 : 2;
            }
        }
        vq92.e = i2;
        vq92.g = this.$filePath;
        vq92.h = this.$inputSampleRate;
        vq92.i = this.$outputSampleRate;
        vq92.j = this.$fallbackTimeLimitMillis;
        vq92.k = this.$fallbackStutterCountMillis;
        vq92.l = this.$fallbackTimeframeMillis;
        vq92.m = this.$logTimings;
        Runnable runnable = this.$onNoiseSuppressorDisabledDueToStutter;
        if (runnable != null) {
            vq92.n = new e09(0, runnable, Runnable.class, "run", "run()V", 0, 20);
        }
        boolean z2 = vq92.a;
        boolean z3 = vq92.b;
        boolean z4 = vq92.c;
        boolean z5 = vq92.d;
        PeerConnectionFactory.EnhancerKind enhancerKind2 = vq92.f;
        String str = vq92.g;
        int i3 = vq92.h;
        int i4 = vq92.i;
        int i5 = vq92.j;
        int i6 = vq92.k;
        int i7 = vq92.l;
        boolean z6 = vq92.m;
        e09 e09 = vq92.n;
        if (e09 != null) {
            z = z6;
            yh0 = new yh0(5, e09);
        } else {
            z = z6;
            yh0 = null;
        }
        return new wq9(z2, z3, z4, z5, enhancerKind2, str, i3, i4, i5, i6, i7, z, yh0, vq92.e);
    }
}
