package edu.greenriver.it.foodieblog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.io.ClassPathResource;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recipe
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String recipeTitle;

    @Lob
    private String description;

    private String timeToCook;
    private String posted;

    @Lob
    private Byte[] coverImage;

    public String getImage()
    {
        // Check if the image is already located in our
        // /images directory
        String location = "/images/" + recipeTitle + ".jpg";
        if(new ClassPathResource("/static" + location).isFile())
        {
            return location;
        }

        // If not, expect that the recipe cover was uploaded
        return "/recipes/" + recipeTitle + "/image";
    }
}
