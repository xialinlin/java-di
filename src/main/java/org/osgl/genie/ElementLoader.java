package org.osgl.genie;

import java.util.Collection;
import java.util.Map;

/**
 * An `ElementLoader` is responsible for providing initial data
 * to be loaded into a {@link Collection} type
 *
 * @param <E> the generic element type
 */
public interface ElementLoader<E> extends ElementFilter<E> {

    /**
     * Provide element data to be loaded
     * @param options options that could be used to regulate the data loading logic
     * @return an {@link Iterable} of elements
     */
    Iterable<E> load(Map<String, Object> options);

    /**
     * When multiple `ElementLoader` are used together to load initial data, the
     * `priority()` method can used to determine which loader is called first.
     * All following loaders will be treated as {@link ElementFilter} to filter
     * the data series generated by the first loader.
     *
     * A good practice is if a loader loads fewer number of instance,
     * then the priority value shall be lower than that of the loader
     * which loads more instances.
     *
     * @return priority of the loader
     */
    int priority();

}
