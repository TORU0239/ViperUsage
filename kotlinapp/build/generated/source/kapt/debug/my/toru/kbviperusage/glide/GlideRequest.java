package my.toru.kbviperusage.glide;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.CheckResult;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.lang.Class;
import java.lang.Cloneable;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.URL;

/**
 * Contains all public methods from {@link RequestBuilder<TranscodeType>}, all options from
 * {@link RequestOptions} and all generated options from
 * {@link com.bumptech.glide.annotation.GlideOption} in annotated methods in
 * {@link com.bumptech.glide.annotation.GlideExtension} annotated classes.
 *
 * <p>Generated code, do not modify.
 *
 * @see RequestBuilder<TranscodeType>
 * @see RequestOptions
 */
@SuppressWarnings({
    "unused",
    "deprecation"
})
public class GlideRequest<TranscodeType> extends RequestBuilder<TranscodeType> implements Cloneable {
  GlideRequest(Class<TranscodeType> transcodeClass, RequestBuilder<?> other) {
    super(transcodeClass, other);
  }

  GlideRequest(Glide glide, RequestManager requestManager, Class<TranscodeType> transcodeClass) {
    super(glide, requestManager ,transcodeClass);
  }

  @Override
  @CheckResult
  protected GlideRequest<File> getDownloadOnlyRequest() {
    return new GlideRequest<>(File.class, this).apply(DOWNLOAD_ONLY_OPTIONS);
  }

  /**
   * @see GlideOptions#sizeMultiplier(float)
   */
  public GlideRequest<TranscodeType> sizeMultiplier(float sizeMultiplier) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).sizeMultiplier(sizeMultiplier);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).sizeMultiplier(sizeMultiplier);
    }
    return this;
  }

  /**
   * @see GlideOptions#useUnlimitedSourceGeneratorsPool(boolean)
   */
  public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean flag) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).useUnlimitedSourceGeneratorsPool(flag);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).useUnlimitedSourceGeneratorsPool(flag);
    }
    return this;
  }

  /**
   * @see GlideOptions#onlyRetrieveFromCache(boolean)
   */
  public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean flag) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).onlyRetrieveFromCache(flag);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).onlyRetrieveFromCache(flag);
    }
    return this;
  }

  /**
   * @see GlideOptions#diskCacheStrategy(DiskCacheStrategy)
   */
  public GlideRequest<TranscodeType> diskCacheStrategy(DiskCacheStrategy arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).diskCacheStrategy(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).diskCacheStrategy(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#priority(Priority)
   */
  public GlideRequest<TranscodeType> priority(Priority arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).priority(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).priority(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#placeholder(Drawable)
   */
  public GlideRequest<TranscodeType> placeholder(Drawable arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).placeholder(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).placeholder(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#placeholder(int)
   */
  public GlideRequest<TranscodeType> placeholder(int resourceId) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).placeholder(resourceId);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).placeholder(resourceId);
    }
    return this;
  }

  /**
   * @see GlideOptions#fallback(Drawable)
   */
  public GlideRequest<TranscodeType> fallback(Drawable drawable) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).fallback(drawable);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).fallback(drawable);
    }
    return this;
  }

  /**
   * @see GlideOptions#fallback(int)
   */
  public GlideRequest<TranscodeType> fallback(int resourceId) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).fallback(resourceId);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).fallback(resourceId);
    }
    return this;
  }

  /**
   * @see GlideOptions#error(Drawable)
   */
  public GlideRequest<TranscodeType> error(Drawable arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).error(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).error(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#error(int)
   */
  public GlideRequest<TranscodeType> error(int resourceId) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).error(resourceId);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).error(resourceId);
    }
    return this;
  }

  /**
   * @see GlideOptions#theme(Resources.Theme)
   */
  public GlideRequest<TranscodeType> theme(Resources.Theme theme) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).theme(theme);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).theme(theme);
    }
    return this;
  }

  /**
   * @see GlideOptions#skipMemoryCache(boolean)
   */
  public GlideRequest<TranscodeType> skipMemoryCache(boolean skip) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).skipMemoryCache(skip);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).skipMemoryCache(skip);
    }
    return this;
  }

  /**
   * @see GlideOptions#override(int, int)
   */
  public GlideRequest<TranscodeType> override(int width, int height) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).override(width, height);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).override(width, height);
    }
    return this;
  }

  /**
   * @see GlideOptions#override(int)
   */
  public GlideRequest<TranscodeType> override(int size) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).override(size);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).override(size);
    }
    return this;
  }

  /**
   * @see GlideOptions#signature(Key)
   */
  public GlideRequest<TranscodeType> signature(Key arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).signature(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).signature(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#set(Option<T>, T)
   */
  public <T> GlideRequest<TranscodeType> set(Option<T> arg0, T arg1) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).set(arg0, arg1);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).set(arg0, arg1);
    }
    return this;
  }

  /**
   * @see GlideOptions#decode(Class<?>)
   */
  public GlideRequest<TranscodeType> decode(Class<?> arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).decode(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).decode(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#encodeFormat(Bitmap.CompressFormat)
   */
  public GlideRequest<TranscodeType> encodeFormat(Bitmap.CompressFormat arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).encodeFormat(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).encodeFormat(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#encodeQuality(int)
   */
  public GlideRequest<TranscodeType> encodeQuality(int quality) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).encodeQuality(quality);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).encodeQuality(quality);
    }
    return this;
  }

  /**
   * @see GlideOptions#frame(long)
   */
  public GlideRequest<TranscodeType> frame(long frameTimeMicros) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).frame(frameTimeMicros);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).frame(frameTimeMicros);
    }
    return this;
  }

  /**
   * @see GlideOptions#format(DecodeFormat)
   */
  public GlideRequest<TranscodeType> format(DecodeFormat arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).format(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).format(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#disallowHardwareConfig()
   */
  public GlideRequest<TranscodeType> disallowHardwareConfig() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).disallowHardwareConfig();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).disallowHardwareConfig();
    }
    return this;
  }

  /**
   * @see GlideOptions#downsample(DownsampleStrategy)
   */
  public GlideRequest<TranscodeType> downsample(DownsampleStrategy arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).downsample(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).downsample(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#timeout(int)
   */
  public GlideRequest<TranscodeType> timeout(int timeoutMs) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).timeout(timeoutMs);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).timeout(timeoutMs);
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalCenterCrop()
   */
  public GlideRequest<TranscodeType> optionalCenterCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCenterCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCenterCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#centerCrop()
   */
  public GlideRequest<TranscodeType> centerCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).centerCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).centerCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalFitCenter()
   */
  public GlideRequest<TranscodeType> optionalFitCenter() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalFitCenter();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalFitCenter();
    }
    return this;
  }

  /**
   * @see GlideOptions#fitCenter()
   */
  public GlideRequest<TranscodeType> fitCenter() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).fitCenter();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).fitCenter();
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalCenterInside()
   */
  public GlideRequest<TranscodeType> optionalCenterInside() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCenterInside();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCenterInside();
    }
    return this;
  }

  /**
   * @see GlideOptions#centerInside()
   */
  public GlideRequest<TranscodeType> centerInside() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).centerInside();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).centerInside();
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalCircleCrop()
   */
  public GlideRequest<TranscodeType> optionalCircleCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCircleCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCircleCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#circleCrop()
   */
  public GlideRequest<TranscodeType> circleCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).circleCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).circleCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#transform(Transformation<Bitmap>)
   */
  public GlideRequest<TranscodeType> transform(Transformation<Bitmap> arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).transform(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).transform(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#transforms(Transformation<Bitmap>[])
   */
  @SuppressWarnings({
      "unchecked",
      "varargs"
  })
  public GlideRequest<TranscodeType> transforms(Transformation<Bitmap>... arg0) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).transforms(arg0);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).transforms(arg0);
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalTransform(Transformation<Bitmap>)
   */
  public GlideRequest<TranscodeType> optionalTransform(Transformation<Bitmap> transformation) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalTransform(transformation);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalTransform(transformation);
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalTransform(Class<T>, Transformation<T>)
   */
  public <T> GlideRequest<TranscodeType> optionalTransform(Class<T> resourceClass,
      Transformation<T> transformation) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalTransform(resourceClass, transformation);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalTransform(resourceClass, transformation);
    }
    return this;
  }

  /**
   * @see GlideOptions#transform(Class<T>, Transformation<T>)
   */
  public <T> GlideRequest<TranscodeType> transform(Class<T> resourceClass,
      Transformation<T> transformation) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).transform(resourceClass, transformation);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).transform(resourceClass, transformation);
    }
    return this;
  }

  /**
   * @see GlideOptions#dontTransform()
   */
  public GlideRequest<TranscodeType> dontTransform() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).dontTransform();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).dontTransform();
    }
    return this;
  }

  /**
   * @see GlideOptions#dontAnimate()
   */
  public GlideRequest<TranscodeType> dontAnimate() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).dontAnimate();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).dontAnimate();
    }
    return this;
  }

  @Override
  public GlideRequest<TranscodeType> apply(RequestOptions arg0) {
    return (GlideRequest<TranscodeType>) super.apply(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> transition(TransitionOptions<?, ? super TranscodeType> arg0) {
    return (GlideRequest<TranscodeType>) super.transition(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> listener(RequestListener<TranscodeType> arg0) {
    return (GlideRequest<TranscodeType>) super.listener(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> thumbnail(RequestBuilder<TranscodeType> arg0) {
    return (GlideRequest<TranscodeType>) super.thumbnail(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> thumbnail(float sizeMultiplier) {
    return (GlideRequest<TranscodeType>) super.thumbnail(sizeMultiplier);
  }

  @Override
  public GlideRequest<TranscodeType> load(Object arg0) {
    return (GlideRequest<TranscodeType>) super.load(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> load(String arg0) {
    return (GlideRequest<TranscodeType>) super.load(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> load(Uri arg0) {
    return (GlideRequest<TranscodeType>) super.load(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> load(File arg0) {
    return (GlideRequest<TranscodeType>) super.load(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> load(Integer arg0) {
    return (GlideRequest<TranscodeType>) super.load(arg0);
  }

  @Override
  @Deprecated
  public GlideRequest<TranscodeType> load(URL arg0) {
    return (GlideRequest<TranscodeType>) super.load(arg0);
  }

  @Override
  public GlideRequest<TranscodeType> load(byte[] arg0) {
    return (GlideRequest<TranscodeType>) super.load(arg0);
  }

  @Override
  @CheckResult
  public GlideRequest<TranscodeType> clone() {
    return (GlideRequest<TranscodeType>) super.clone();
  }
}
