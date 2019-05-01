package ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.jarinformation.generated;

import ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.jarinformation.JarInformation;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * ca.concordia.jaranalyzer.DBModels.jaranalysis.jaranalysis.jarinformation.JarInformation}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedJarInformationManager extends Manager<JarInformation> {
    
    TableIdentifier<JarInformation> IDENTIFIER = TableIdentifier.of("JarAnalysis", "JarAnalysis", "JarInformation");
    List<Field<JarInformation>> FIELDS = unmodifiableList(asList(
        JarInformation.ID,
        JarInformation.ARTIFACT_ID,
        JarInformation.GROUP_ID,
        JarInformation.VERSION
    ));
    
    @Override
    default Class<JarInformation> getEntityClass() {
        return JarInformation.class;
    }
}