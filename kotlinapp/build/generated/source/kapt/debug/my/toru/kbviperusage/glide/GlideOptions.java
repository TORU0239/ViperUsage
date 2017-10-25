package my.toru.kbviperusage.glide;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.CheckResult;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.RequestOptions;
import java.lang.Class;
import java.lang.Cloneable;
import java.lang.Override;
import java.lang.SafeVarargs;
import java.lang.SuppressWarnings;

/**
 * Automatically generated from {@link com.bumptech.glide.annotation.GlideExtension} annotated classes.
 *
 * @see RequestOptions
 */
@SuppressWarnings("deprecation")
public final class GlideOptions extends RequestOptions implements Cloneable {
  private static GlideOptions fitCenterTransform0;

  private static GlideOptions centerInsideTransform1;

  private static GlideOptions centerCropTransform2;

  private static GlideOptions circleCropTransform3;

  private static GlideOptions noTransformation4;

  private static GlideOptions noAnimation5;

  /**
   * @see RequestOptions#sizeMultiplierOf(float)
   */
  @CheckResult
  public static GlideOptions sizeMultiplierOf(float sizeMultiplier) {
    return new GlideOptions().sizeMultiplier(sizeMultiplier);
  }

  /**
   * @see RequestOptions#diskCacheStrategyOf(DiskCacheStrategy)
   */
  @CheckResult
  public static GlideOptions diskCacheStrategyOf(DiskCacheStrategy arg0) {
    return new GlideOptions().diskCacheStrategy(arg0);
  }

  /**
   * @see RequestOptions#priorityOf(Priority)
   */
  @CheckResult
  public static GlideOptions priorityOf(Priority arg0) {
    return new GlideOptions().priority(arg0);
  }

  /**
   * @see RequestOptions#placeholderOf(Drawable)
   */
  @CheckResult
  public static GlideOptions placeholderOf(Drawable arg0) {
    return new GlideOptions().placeholder(arg0);
  }

  /**
   * @see RequestOptions#placeholderOf(int)
   */
  @CheckResult
  public static GlideOptions placeholderOf(int placeholderId) {
    return new GlideOptions().placeholder(placeholderId);
  }

  /**
   * @see RequestOptions#errorOf(Drawable)
   */
  @CheckResult
  public static GlideOptions errorOf(Drawable arg0) {
    return new GlideOptions().error(arg0);
  }

  /**
   * @see RequestOptions#errorOf(int)
   */
  @CheckResult
  public static GlideOptions errorOf(int errorId) {
    return new GlideOptions().error(errorId);
  }

  /**
   * @see RequestOptions#skipMemoryCacheOf(boolean)
   */
  @CheckResult
  public static GlideOptions skipMemoryCacheOf(boolean skipMemoryCache) {
    return new GlideOptions().skipMemoryCache(skipMemoryCache);
  }

  /**
   * @see RequestOptions#overrideOf(int, int)
   */
  @CheckResult
  public static GlideOptions overrideOf(int width, int height) {
    return new GlideOptions().override(width, height);
  }

  /**
   * @see RequestOptions#overrideOf(int)
   */
  @CheckResult
  public static GlideOptions overrideOf(int size) {
    return new GlideOptions().override(size);
  }

  /**
   * @see RequestOptions#signatureOf(Key)
   */
  @CheckResult
  public static GlideOptions signatureOf(Key arg0) {
    return new GlideOptions().signature(arg0);
  }

  /**
   * @see RequestOptions#fitCenterTransform()
   */
  @CheckResult
  public static GlideOptions fitCenterTransform() {
    if (GlideOptions.fitCenterTransform0 == null) {
      GlideOptions.fitCenterTransform0 =
          new GlideOptions().fitCenter().autoClone();
    }
    return GlideOptions.fitCenterTransform0;
  }

  /**
   * @see RequestOptions#centerInsideTransform()
   */
  @CheckResult
  public static GlideOptions centerInsideTransform() {
    if (GlideOptions.centerInsideTransform1 == null) {
      GlideOptions.centerInsideTransform1 =
          new GlideOptions().centerInside().autoClone();
    }
    return GlideOptions.centerInsideTransform1;
  }

  /**
   * @see RequestOptions#centerCropTransform()
   */
  @CheckResult
  public static GlideOptions centerCropTransform() {
    if (GlideOptions.centerCropTransform2 == null) {
      GlideOptions.centerCropTransform2 =
          new GlideOptions().centerCrop().autoClone();
    }
    return GlideOptions.centerCropTransform2;
  }

  /**
   * @see RequestOptions#circleCropTransform()
   */
  @CheckResult
  public static GlideOptions circleCropTransform() {
    if (GlideOptions.circleCropTransform3 == null) {
      GlideOptions.circleCropTransform3 =
          new GlideOptions().circleCrop().autoClone();
    }
    return GlideOptions.circleCropTransform3;
  }

  /**
   * @see RequestOptions#bitmapTransform(Transformation)
   */
  @CheckResult
  public static GlideOptions bitmapTransform(Transformation<Bitmap> arg0) {
    return new GlideOptions().transform(arg0);
  }

  /**
   * @see RequestOptions#noTransformation()
   */
  @CheckResult
  public static GlideOptions noTransformation() {
    if (GlideOptions.noTransformation4 == null) {
      GlideOptions.noTransformation4 =
          new GlideOptions().dontTransform().autoClone();
    }
    return GlideOptions.noTransformation4;
  }

  /**
   * @see RequestOptions#option(Option, T)
   */
  @CheckResult
  public static <T> GlideOptions option(Option<T> arg0, T arg1) {
    return new GlideOptions().set(arg0, arg1);
  }

  /**
   * @see RequestOptions#decodeTypeOf(Class)
   */
  @CheckResult
  public static GlideOptions decodeTypeOf(Class<?> arg0) {
    return new GlideOptions().decode(arg0);
  }

  /**
   * @see RequestOptions#formatOf(DecodeFormat)
   */
  @CheckResult
  public static GlideOptions formatOf(DecodeFormat arg0) {
    return new GlideOptions().format(arg0);
  }

  /**
   * @see RequestOptions#frameOf(long)
   */
  @CheckResult
  public static GlideOptions frameOf(long frameTimeMicros) {
    return new GlideOptions().frame(frameTimeMicros);
  }

  /**
   * @see RequestOptions#downsampleOf(DownsampleStrategy)
   */
  @CheckResult
  public static GlideOptions downsampleOf(DownsampleStrategy arg0) {
    return new GlideOptions().downsample(arg0);
  }

  /**
   * @see RequestOptions#timeoutOf(int)
   */
  @CheckResult
  public static GlideOptions timeoutOf(int timeout) {
    return new GlideOptions().timeout(timeout);
  }

  /**
   * @see RequestOptions#encodeQualityOf(int)
   */
  @CheckResult
  public static GlideOptions encodeQualityOf(int quality) {
    return new GlideOptions().encodeQuality(quality);
  }

  /**
   * @see RequestOptions#encodeFormatOf(CompressFormat)
   */
  @CheckResult
  public static GlideOptions encodeFormatOf(Bitmap.CompressFormat arg0) {
    return new GlideOptions().encodeFormat(arg0);
  }

  /**
   * @see RequestOptions#noAnimation()
   */
  @CheckResult
  public static GlideOptions noAnimation() {
    if (GlideOptions.noAnimation5 == null) {
      GlideOptions.noAnimation5 =
          new GlideOptions().dontAnimate().autoClone();
    }
    return GlideOptions.noAnimation5;
  }

  @Override
  @CheckResult
  public final GlideOptions sizeMultiplier(float sizeMultiplier) {
    return (GlideOptions) super.sizeMultiplier(sizeMultiplier);
  }

  @Override
  @CheckResult
  public final GlideOptions useUnlimitedSourceGeneratorsPool(boolean flag) {
    return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(flag);
  }

  @Override
  @CheckResult
  public final GlideOptions onlyRetrieveFromCache(boolean flag) {
    return (GlideOptions) super.onlyRetrieveFromCache(flag);
  }

  @Override
  @CheckResult
  public final GlideOptions diskCacheStrategy(DiskCacheStrategy arg0) {
    return (GlideOptions) super.diskCacheStrategy(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions priority(Priority arg0) {
    return (GlideOptions) super.priority(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions placeholder(Drawable arg0) {
    return (GlideOptions) super.placeholder(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions placeholder(int resourceId) {
    return (GlideOptions) super.placeholder(resourceId);
  }

  @Override
  @CheckResult
  public final GlideOptions fallback(Drawable drawable) {
    return (GlideOptions) super.fallback(drawable);
  }

  @Override
  @CheckResult
  public final GlideOptions fallback(int resourceId) {
    return (GlideOptions) super.fallback(resourceId);
  }

  @Override
  @CheckResult
  public final GlideOptions error(Drawable arg0) {
    return (GlideOptions) super.error(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions error(int resourceId) {
    return (GlideOptions) super.error(resourceId);
  }

  @Override
  @CheckResult
  public final GlideOptions theme(Resources.Theme theme) {
    return (GlideOptions) super.theme(theme);
  }

  @Override
  @CheckResult
  public final GlideOptions skipMemoryCache(boolean skip) {
    return (GlideOptions) super.skipMemoryCache(skip);
  }

  @Override
  @CheckResult
  public final GlideOptions override(int width, int height) {
    return (GlideOptions) super.override(width, height);
  }

  @Override
  @CheckResult
  public final GlideOptions override(int size) {
    return (GlideOptions) super.override(size);
  }

  @Override
  @CheckResult
  public final GlideOptions signature(Key arg0) {
    return (GlideOptions) super.signature(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions clone() {
    return (GlideOptions) super.clone();
  }

  @Override
  @CheckResult
  public final <T> GlideOptions set(Option<T> arg0, T arg1) {
    return (GlideOptions) super.set(arg0, arg1);
  }

  @Override
  @CheckResult
  public final GlideOptions decode(Class<?> arg0) {
    return (GlideOptions) super.decode(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions encodeFormat(Bitmap.CompressFormat arg0) {
    return (GlideOptions) super.encodeFormat(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions encodeQuality(int quality) {
    return (GlideOptions) super.encodeQuality(quality);
  }

  @Override
  @CheckResult
  public final GlideOptions frame(long frameTimeMicros) {
    return (GlideOptions) super.frame(frameTimeMicros);
  }

  @Override
  @CheckResult
  public final GlideOptions format(DecodeFormat arg0) {
    return (GlideOptions) super.format(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions disallowHardwareConfig() {
    return (GlideOptions) super.disallowHardwareConfig();
  }

  @Override
  @CheckResult
  public final GlideOptions downsample(DownsampleStrategy arg0) {
    return (GlideOptions) super.downsample(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions timeout(int timeoutMs) {
    return (GlideOptions) super.timeout(timeoutMs);
  }

  @Override
  @CheckResult
  public final GlideOptions optionalCenterCrop() {
    return (GlideOptions) super.optionalCenterCrop();
  }

  @Override
  @CheckResult
  public final GlideOptions centerCrop() {
    return (GlideOptions) super.centerCrop();
  }

  @Override
  @CheckResult
  public final GlideOptions optionalFitCenter() {
    return (GlideOptions) super.optionalFitCenter();
  }

  @Override
  @CheckResult
  public final GlideOptions fitCenter() {
    return (GlideOptions) super.fitCenter();
  }

  @Override
  @CheckResult
  public final GlideOptions optionalCenterInside() {
    return (GlideOptions) super.optionalCenterInside();
  }

  @Override
  @CheckResult
  public final GlideOptions centerInside() {
    return (GlideOptions) super.centerInside();
  }

  @Override
  @CheckResult
  public final GlideOptions optionalCircleCrop() {
    return (GlideOptions) super.optionalCircleCrop();
  }

  @Override
  @CheckResult
  public final GlideOptions circleCrop() {
    return (GlideOptions) super.circleCrop();
  }

  @Override
  @CheckResult
  public final GlideOptions transform(Transformation<Bitmap> arg0) {
    return (GlideOptions) super.transform(arg0);
  }

  @Override
  @SafeVarargs
  @CheckResult
  public final GlideOptions transforms(Transformation<Bitmap>... arg0) {
    return (GlideOptions) super.transforms(arg0);
  }

  @Override
  @CheckResult
  public final GlideOptions optionalTransform(Transformation<Bitmap> transformation) {
    return (GlideOptions) super.optionalTransform(transformation);
  }

  @Override
  @CheckResult
  public final <T> GlideOptions optionalTransform(Class<T> resourceClass,
      Transformation<T> transformation) {
    return (GlideOptions) super.optionalTransform(resourceClass, transformation);
  }

  @Override
  @CheckResult
  public final <T> GlideOptions transform(Class<T> resourceClass,
      Transformation<T> transformation) {
    return (GlideOptions) super.transform(resourceClass, transformation);
  }

  @Override
  @CheckResult
  public final GlideOptions dontTransform() {
    return (GlideOptions) super.dontTransform();
  }

  @Override
  @CheckResult
  public final GlideOptions dontAnimate() {
    return (GlideOptions) super.dontAnimate();
  }

  @Override
  @CheckResult
  public final GlideOptions apply(RequestOptions other) {
    return (GlideOptions) super.apply(other);
  }

  @Override
  public final GlideOptions lock() {
    return (GlideOptions) super.lock();
  }

  @Override
  public final GlideOptions autoClone() {
    return (GlideOptions) super.autoClone();
  }
}
