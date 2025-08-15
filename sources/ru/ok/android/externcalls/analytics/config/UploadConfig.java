package ru.ok.android.externcalls.analytics.config;

import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b$\b\b\u0018\u0000 F2\u00020\u0001:\u0001FB©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u001a\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u001a\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u001a\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001bJ²\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0014J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u0018R!\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001bR!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u001bR!\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u001bR!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b5\u0010\u001bR!\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b6\u0010\u001bR!\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b7\u0010\u001bR\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u0010\u0014R\u0011\u0010;\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010\u0014R\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010\u0014R\u0013\u0010@\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010C\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bD\u0010B¨\u0006G"}, d2 = {"Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "", "uploadJobId", "Ljava/util/concurrent/Executor;", "uploadExecutor", "", "maxTimeToUploadMillis", "silenceToUploadMillis", "Lkotlin/Function0;", "maxFileLengthKbProvider", "maxEventCountProvider", "maxLocalCacheFileCountProvider", "timeToUploadNextMsProvider", "", "compressContentProvider", "disableUploadWhenCallIsActiveProvider", "<init>", "(ILjava/util/concurrent/Executor;JJLk56;Lk56;Lk56;Lk56;Lk56;Lk56;)V", "component1", "()I", "component2", "()Ljava/util/concurrent/Executor;", "component3", "()J", "component4", "component5", "()Lk56;", "component6", "component7", "component8", "component9", "component10", "copy", "(ILjava/util/concurrent/Executor;JJLk56;Lk56;Lk56;Lk56;Lk56;Lk56;)Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUploadJobId", "Ljava/util/concurrent/Executor;", "getUploadExecutor", "J", "getMaxTimeToUploadMillis", "getSilenceToUploadMillis", "Lk56;", "getMaxFileLengthKbProvider", "getMaxEventCountProvider", "getMaxLocalCacheFileCountProvider", "getTimeToUploadNextMsProvider", "getCompressContentProvider", "getDisableUploadWhenCallIsActiveProvider", "getFileLengthTriggerToUploadBytes", "fileLengthTriggerToUploadBytes", "getEventCountToUploadNumber", "eventCountToUploadNumber", "getMaxLocalCacheFileCount", "maxLocalCacheFileCount", "getTimeToUploadNextMs", "()Ljava/lang/Long;", "timeToUploadNextMs", "getCompressContent", "()Z", "compressContent", "getDisableUploadWhenCallIsActive", "disableUploadWhenCallIsActive", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class UploadConfig {
    public static final Companion Companion = new Companion((z84) null);
    public static final int DEFAULT_MAX_EVENT_COUNT = 500;
    public static final int DEFAULT_MAX_FILE_SIZE_KB = 100;
    private final k56 compressContentProvider;
    private final k56 disableUploadWhenCallIsActiveProvider;
    private final k56 maxEventCountProvider;
    private final k56 maxFileLengthKbProvider;
    private final k56 maxLocalCacheFileCountProvider;
    private final long maxTimeToUploadMillis;
    private final long silenceToUploadMillis;
    private final k56 timeToUploadNextMsProvider;
    private final Executor uploadExecutor;
    private final int uploadJobId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/analytics/config/UploadConfig$Companion;", "", "()V", "DEFAULT_MAX_EVENT_COUNT", "", "DEFAULT_MAX_FILE_SIZE_KB", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public UploadConfig() {
        this(0, (Executor) null, 0, 0, (k56) null, (k56) null, (k56) null, (k56) null, (k56) null, (k56) null, 1023, (z84) null);
    }

    public static /* synthetic */ UploadConfig copy$default(UploadConfig uploadConfig, int i, Executor executor, long j, long j2, k56 k56, k56 k562, k56 k563, k56 k564, k56 k565, k56 k566, int i2, Object obj) {
        UploadConfig uploadConfig2 = uploadConfig;
        int i3 = i2;
        return uploadConfig.copy((i3 & 1) != 0 ? uploadConfig2.uploadJobId : i, (i3 & 2) != 0 ? uploadConfig2.uploadExecutor : executor, (i3 & 4) != 0 ? uploadConfig2.maxTimeToUploadMillis : j, (i3 & 8) != 0 ? uploadConfig2.silenceToUploadMillis : j2, (i3 & 16) != 0 ? uploadConfig2.maxFileLengthKbProvider : k56, (i3 & 32) != 0 ? uploadConfig2.maxEventCountProvider : k562, (i3 & 64) != 0 ? uploadConfig2.maxLocalCacheFileCountProvider : k563, (i3 & 128) != 0 ? uploadConfig2.timeToUploadNextMsProvider : k564, (i3 & 256) != 0 ? uploadConfig2.compressContentProvider : k565, (i3 & 512) != 0 ? uploadConfig2.disableUploadWhenCallIsActiveProvider : k566);
    }

    public final int component1() {
        return this.uploadJobId;
    }

    public final k56 component10() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final Executor component2() {
        return this.uploadExecutor;
    }

    public final long component3() {
        return this.maxTimeToUploadMillis;
    }

    public final long component4() {
        return this.silenceToUploadMillis;
    }

    public final k56 component5() {
        return this.maxFileLengthKbProvider;
    }

    public final k56 component6() {
        return this.maxEventCountProvider;
    }

    public final k56 component7() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final k56 component8() {
        return this.timeToUploadNextMsProvider;
    }

    public final k56 component9() {
        return this.compressContentProvider;
    }

    public final UploadConfig copy(int i, Executor executor, long j, long j2, k56 k56, k56 k562, k56 k563, k56 k564, k56 k565, k56 k566) {
        return new UploadConfig(i, executor, j, j2, k56, k562, k563, k564, k565, k566);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) obj;
        return this.uploadJobId == uploadConfig.uploadJobId && tpa.f(this.uploadExecutor, uploadConfig.uploadExecutor) && this.maxTimeToUploadMillis == uploadConfig.maxTimeToUploadMillis && this.silenceToUploadMillis == uploadConfig.silenceToUploadMillis && tpa.f(this.maxFileLengthKbProvider, uploadConfig.maxFileLengthKbProvider) && tpa.f(this.maxEventCountProvider, uploadConfig.maxEventCountProvider) && tpa.f(this.maxLocalCacheFileCountProvider, uploadConfig.maxLocalCacheFileCountProvider) && tpa.f(this.timeToUploadNextMsProvider, uploadConfig.timeToUploadNextMsProvider) && tpa.f(this.compressContentProvider, uploadConfig.compressContentProvider) && tpa.f(this.disableUploadWhenCallIsActiveProvider, uploadConfig.disableUploadWhenCallIsActiveProvider);
    }

    public final boolean getCompressContent() {
        Boolean bool;
        k56 k56 = this.compressContentProvider;
        if (k56 == null || (bool = (Boolean) k56.invoke()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final k56 getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final boolean getDisableUploadWhenCallIsActive() {
        Boolean bool;
        k56 k56 = this.disableUploadWhenCallIsActiveProvider;
        if (k56 == null || (bool = (Boolean) k56.invoke()) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final k56 getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getEventCountToUploadNumber() {
        Integer num;
        k56 k56 = this.maxEventCountProvider;
        if (k56 == null || (num = (Integer) k56.invoke()) == null) {
            return 500;
        }
        return num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (java.lang.Integer) r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getFileLengthTriggerToUploadBytes() {
        /*
            r0 = this;
            k56 r0 = r0.maxFileLengthKbProvider
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.invoke()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0011
            int r0 = r0.intValue()
            goto L_0x0013
        L_0x0011:
            r0 = 100
        L_0x0013:
            int r0 = r0 * 1000
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.config.UploadConfig.getFileLengthTriggerToUploadBytes():int");
    }

    public final k56 getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    public final k56 getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    public final int getMaxLocalCacheFileCount() {
        Integer num;
        k56 k56 = this.maxLocalCacheFileCountProvider;
        if (k56 == null || (num = (Integer) k56.invoke()) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final k56 getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    public final Long getTimeToUploadNextMs() {
        k56 k56 = this.timeToUploadNextMsProvider;
        if (k56 != null) {
            return (Long) k56.invoke();
        }
        return null;
    }

    public final k56 getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.uploadJobId) * 31;
        Executor executor = this.uploadExecutor;
        int i = 0;
        int m = h4f.m(h4f.m((hashCode + (executor == null ? 0 : executor.hashCode())) * 31, 31, this.maxTimeToUploadMillis), 31, this.silenceToUploadMillis);
        k56 k56 = this.maxFileLengthKbProvider;
        int hashCode2 = (m + (k56 == null ? 0 : k56.hashCode())) * 31;
        k56 k562 = this.maxEventCountProvider;
        int hashCode3 = (hashCode2 + (k562 == null ? 0 : k562.hashCode())) * 31;
        k56 k563 = this.maxLocalCacheFileCountProvider;
        int hashCode4 = (hashCode3 + (k563 == null ? 0 : k563.hashCode())) * 31;
        k56 k564 = this.timeToUploadNextMsProvider;
        int hashCode5 = (hashCode4 + (k564 == null ? 0 : k564.hashCode())) * 31;
        k56 k565 = this.compressContentProvider;
        int hashCode6 = (hashCode5 + (k565 == null ? 0 : k565.hashCode())) * 31;
        k56 k566 = this.disableUploadWhenCallIsActiveProvider;
        if (k566 != null) {
            i = k566.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        int i = this.uploadJobId;
        Executor executor = this.uploadExecutor;
        long j = this.maxTimeToUploadMillis;
        long j2 = this.silenceToUploadMillis;
        k56 k56 = this.maxFileLengthKbProvider;
        k56 k562 = this.maxEventCountProvider;
        k56 k563 = this.maxLocalCacheFileCountProvider;
        k56 k564 = this.timeToUploadNextMsProvider;
        k56 k565 = this.compressContentProvider;
        k56 k566 = this.disableUploadWhenCallIsActiveProvider;
        StringBuilder sb = new StringBuilder("UploadConfig(uploadJobId=");
        sb.append(i);
        sb.append(", uploadExecutor=");
        sb.append(executor);
        sb.append(", maxTimeToUploadMillis=");
        sb.append(j);
        au1.q(j2, ", silenceToUploadMillis=", ", maxFileLengthKbProvider=", sb);
        sb.append(k56);
        sb.append(", maxEventCountProvider=");
        sb.append(k562);
        sb.append(", maxLocalCacheFileCountProvider=");
        sb.append(k563);
        sb.append(", timeToUploadNextMsProvider=");
        sb.append(k564);
        sb.append(", compressContentProvider=");
        sb.append(k565);
        sb.append(", disableUploadWhenCallIsActiveProvider=");
        sb.append(k566);
        sb.append(")");
        return sb.toString();
    }

    public UploadConfig(int i, Executor executor, long j, long j2, k56 k56, k56 k562, k56 k563, k56 k564, k56 k565, k56 k566) {
        this.uploadJobId = i;
        this.uploadExecutor = executor;
        this.maxTimeToUploadMillis = j;
        this.silenceToUploadMillis = j2;
        this.maxFileLengthKbProvider = k56;
        this.maxEventCountProvider = k562;
        this.maxLocalCacheFileCountProvider = k563;
        this.timeToUploadNextMsProvider = k564;
        this.compressContentProvider = k565;
        this.disableUploadWhenCallIsActiveProvider = k566;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UploadConfig(int r14, java.util.concurrent.Executor r15, long r16, long r18, defpackage.k56 r20, defpackage.k56 r21, defpackage.k56 r22, defpackage.k56 r23, defpackage.k56 r24, defpackage.k56 r25, int r26, defpackage.z84 r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            r1 = 3815413(0x3a37f5, float:5.346532E-39)
            goto L_0x000b
        L_0x000a:
            r1 = r14
        L_0x000b:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0013
        L_0x0012:
            r2 = r15
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x001f
        L_0x001d:
            r4 = r16
        L_0x001f:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0026
            r6 = 15000(0x3a98, double:7.411E-320)
            goto L_0x0028
        L_0x0026:
            r6 = r18
        L_0x0028:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002e
            r8 = r3
            goto L_0x0030
        L_0x002e:
            r8 = r20
        L_0x0030:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0036
            r9 = r3
            goto L_0x0038
        L_0x0036:
            r9 = r21
        L_0x0038:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003e
            r10 = r3
            goto L_0x0040
        L_0x003e:
            r10 = r22
        L_0x0040:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0046
            r11 = r3
            goto L_0x0048
        L_0x0046:
            r11 = r23
        L_0x0048:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004e
            r12 = r3
            goto L_0x0050
        L_0x004e:
            r12 = r24
        L_0x0050:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r3 = r25
        L_0x0057:
            r14 = r1
            r15 = r2
            r16 = r4
            r18 = r6
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r3
            r13.<init>(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.config.UploadConfig.<init>(int, java.util.concurrent.Executor, long, long, k56, k56, k56, k56, k56, k56, int, z84):void");
    }
}
